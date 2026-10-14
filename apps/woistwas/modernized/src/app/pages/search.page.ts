import { Component, inject, signal } from '@angular/core';
import { Geolocation } from '@capacitor/geolocation';
import { addIcons } from 'ionicons';
import { locate } from 'ionicons/icons';
import {
  AlertController,
  IonButton,
  IonButtons,
  IonContent,
  IonHeader,
  IonIcon,
  IonItem,
  IonLabel,
  IonList,
  IonSearchbar,
  IonToolbar,
  LoadingController,
} from '@ionic/angular';
import { Hit, MAX_DISTANCE_KM, MAX_RESULTS, nearbyCities, searchCities } from '../cities';
import { CityService } from '../services/city.service';
import { CityItem } from './city-item';

const HINT = 'Suche nach einem Ort oder benutze die GPS-Suche.';

@Component({
  selector: 'app-search',
  imports: [
    IonButton,
    IonButtons,
    IonContent,
    IonHeader,
    IonIcon,
    IonItem,
    IonLabel,
    IonList,
    IonSearchbar,
    IonToolbar,
    CityItem,
  ],
  template: `
    <ion-header>
      <ion-toolbar>
        <ion-searchbar
          placeholder="Ort oder Postleitzahl"
          [debounce]="500"
          (ionInput)="search($any($event).detail.value ?? '')"
        />
        <ion-buttons slot="end">
          <ion-button aria-label="Standort" (click)="searchNearby()"
            ><ion-icon slot="icon-only" name="locate"
          /></ion-button>
        </ion-buttons>
      </ion-toolbar>
    </ion-header>
    <ion-content>
      @if (hits().length) {
        <ion-item lines="none">
          <ion-label class="ion-text-wrap" style="font-size: small">
            Hinweis: Es werden maximal {{ max }} Orte{{
              nearby() ? ' im Umkreis von maximal ' + maxKm + ' km' : ''
            }}
            angezeigt.
          </ion-label>
        </ion-item>
        <ion-list>
          @for (hit of hits(); track $index) {
            <app-city-item [hit]="hit" />
          }
        </ion-list>
      } @else {
        <ion-item lines="none">{{ message() }}</ion-item>
      }
    </ion-content>
  `,
})
export class SearchPage {
  private readonly cityService = inject(CityService);
  private readonly alerts = inject(AlertController);
  private readonly loading = inject(LoadingController);

  readonly max = MAX_RESULTS;
  readonly maxKm = MAX_DISTANCE_KM;
  readonly hits = signal<Hit[]>([]);
  readonly nearby = signal(false);
  readonly message = signal(HINT);

  constructor() {
    addIcons({ locate });
  }

  async search(input: string) {
    const cities = await this.cityService.all();
    this.show(
      searchCities(cities, input).map((city) => ({ city })),
      false,
      input.trim() ? undefined : HINT,
    );
  }

  async searchNearby() {
    const loading = await this.loading.create({ message: 'Standort wird gesucht...' });
    await loading.present();
    try {
      const { coords } = await Geolocation.getCurrentPosition({ enableHighAccuracy: true });
      this.show(
        nearbyCities(await this.cityService.all(), coords.latitude, coords.longitude),
        true,
      );
    } catch (e) {
      const denied =
        (e as { code?: number | string }).code === 1 ||
        (e as { code?: number | string }).code === 'PERMISSION_DENIED';
      await (
        await this.alerts.create({
          header: denied ? 'Zugriff verweigert' : 'Fehler',
          subHeader: denied
            ? 'Bitte berechtige die App deinen Standort abzurufen.'
            : 'Dein aktueller Standort konnte nicht ermittelt werden.',
          buttons: ['OK'],
        })
      ).present();
    } finally {
      await loading.dismiss();
    }
  }

  private show(hits: Hit[], nearby: boolean, message?: string) {
    this.hits.set(hits);
    this.nearby.set(nearby);
    this.message.set(
      message ??
        'Es wurde kein Ort gefunden. Bitte überprüfe deinen Standort oder ändere deinen Suchbegriff.',
    );
  }
}
