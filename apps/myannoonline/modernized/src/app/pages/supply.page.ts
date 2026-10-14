import { Component } from '@angular/core';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular';
import { RATES, supply } from '../consumption';
import { GOODS } from '../goods';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-supply',
  imports: [TrPipe, IonContent, IonHeader, IonTitle, IonToolbar],
  template: `
    <ion-header><ion-toolbar color="primary"><ion-title>Residents per building</ion-title></ion-toolbar></ion-header>
    <ion-content>
      <table>
        <tr><th>Good</th><th>Pioneers</th><th>Settlers</th><th>Merchants</th><th>Nobles</th></tr>
        @for (row of rows; track row.good) {
          <tr><td>{{ row.name | tr }}</td>@for (n of row.supply; track $index) {<td>{{ n || '-' }}</td>}</tr>
        }
      </table>
    </ion-content>
  `,
  styles: 'table { width: 100%; border-collapse: collapse } td, th { padding: 6px; text-align: right } td:first-child, th:first-child { text-align: left }',
})
export class SupplyPage {
  protected readonly rows = Object.keys(RATES).map((good) => ({
    good,
    name: GOODS[good].name,
    supply: [0, 1, 2, 3].map((t) => supply(good, t)),
  }));
}
