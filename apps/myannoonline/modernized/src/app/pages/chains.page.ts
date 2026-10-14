import { Component, signal } from '@angular/core';
import { IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonTitle, IonToolbar } from '@ionic/angular';
import { Building, producers } from '../buildings';
import { INPUTS } from '../consumption';
import { GOODS } from '../goods';
import { BuildingDetailComponent } from './building-detail.component';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-chains',
  imports: [TrPipe, BuildingDetailComponent, IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonTitle, IonToolbar],
  template: `
    <ion-header><ion-toolbar color="primary"><ion-title>{{ 'Chains' | tr }}</ion-title></ion-toolbar></ion-header>
    <ion-content>
      <ion-accordion-group>
        @for (g of goods(); track g.id) {
          <ion-accordion [value]="g.id">
            <ion-item slot="header"><ion-label>{{ g.name | tr }}</ion-label></ion-item>
            <div slot="content">
              @if (g.inputs) {
                <ion-item><ion-label>{{ 'Needs' | tr }} {{ g.inputs }}</ion-label></ion-item>
              }
              @for (b of g.buildings; track b.id) {
                <app-building-detail [building]="b" />
              }
            </div>
          </ion-accordion>
        }
      </ion-accordion-group>
    </ion-content>
  `,
})
export class ChainsPage {
  protected readonly goods = signal<{ id: string; name: string; inputs: string; buildings: Building[] }[]>([]);

  constructor() {
    fetch('buildings.json')
      .then((r) => r.json() as Promise<Building[]>)
      .then((all) =>
        this.goods.set(
          Object.entries(GOODS)
            .map(([id, { name }]) => ({
              id,
              name,
              inputs: (INPUTS[id] ?? []).map((i) => GOODS[i].name).join(', '),
              buildings: producers(all, id),
            }))
            .filter((g) => g.buildings.length),
        ),
      );
  }
}
