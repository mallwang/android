import { Component, inject, input } from '@angular/core';
import { Clipboard } from '@capacitor/clipboard';
import { IonItem, IonLabel, ToastController } from '@ionic/angular';
import { Hit } from '../cities';

/** One city row; tapping copies "zip name" to the clipboard (legacy ionic3 feature). */
@Component({
  selector: 'app-city-item',
  imports: [IonItem, IonLabel],
  template: `
    <ion-item button (click)="copy()">
      <ion-label>
        <h2>{{ hit().city.zip }} {{ hit().city.name }}</h2>
        <h3>{{ hit().city.district }}</h3>
        <p>
          {{ hit().city.state }}
          @if (hit().km !== undefined) {
            - {{ hit().km!.toFixed(1) }} km entfernt
          }
        </p>
      </ion-label>
    </ion-item>
  `,
})
export class CityItem {
  readonly hit = input.required<Hit>();

  private readonly toast = inject(ToastController);

  async copy() {
    const { zip, name } = this.hit().city;
    await Clipboard.write({ string: `${zip} ${name}` });
    await (await this.toast.create({ message: 'Kopiert', duration: 1000 })).present();
  }
}
