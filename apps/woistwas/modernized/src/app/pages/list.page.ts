import { Component, inject, signal } from '@angular/core';
import {
  InfiniteScrollCustomEvent,
  IonContent,
  IonInfiniteScroll,
  IonInfiniteScrollContent,
  IonItem,
  IonLabel,
  IonList,
} from '@ionic/angular';
import { City } from '../cities';
import { CityService } from '../services/city.service';
import { CityItem } from './city-item';

const PAGE = 40;

@Component({
  selector: 'app-list',
  imports: [
    IonContent,
    IonInfiniteScroll,
    IonInfiniteScrollContent,
    IonItem,
    IonLabel,
    IonList,
    CityItem,
  ],
  template: `
    <ion-content>
      <ion-item lines="none">
        <ion-label class="ion-text-wrap" style="font-size: small">
          Hinweis: Es werden alle Städte Deutschlands in alphabetischer Reihenfolge aufgelistet.
        </ion-label>
      </ion-item>
      <ion-list>
        @for (city of shown(); track $index) {
          <app-city-item [hit]="{ city }" />
        }
      </ion-list>
      <ion-infinite-scroll (ionInfinite)="more($event)">
        <ion-infinite-scroll-content />
      </ion-infinite-scroll>
    </ion-content>
  `,
})
export class ListPage {
  private all: City[] = [];
  readonly shown = signal<City[]>([]);

  constructor() {
    inject(CityService)
      .all()
      .then((cities) => {
        this.all = cities;
        this.shown.set(cities.slice(0, PAGE));
      });
  }

  more(event: InfiniteScrollCustomEvent) {
    this.shown.update((s) => this.all.slice(0, s.length + PAGE));
    event.target.complete();
    event.target.disabled = this.shown().length >= this.all.length;
  }
}
