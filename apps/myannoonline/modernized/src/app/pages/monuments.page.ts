import { Component, signal } from '@angular/core';
import {
  IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonSegment, IonSegmentButton,
  IonTitle, IonToolbar,
} from '@ionic/angular';
import { GOODS } from '../goods';
import { groupMonuments, Monument } from '../monuments';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-monuments',
  imports: [TrPipe, 
    IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonSegment, IonSegmentButton,
    IonTitle, IonToolbar,
  ],
  template: `
    <ion-header><ion-toolbar color="primary"><ion-title>{{ 'Monuments' | tr }}</ion-title></ion-toolbar></ion-header>
    <ion-content>
      <ion-accordion-group>
        @for (g of groups(); track g.name) {
          <ion-accordion [value]="g.name">
            <ion-item slot="header"><ion-label>{{ g.name | tr }}</ion-label></ion-item>
            <div slot="content">
              <ion-segment [value]="0" #seg>
                @for (p of g.parts; track p.phase; let i = $index) {
                  <ion-segment-button [value]="i"><ion-label>{{ p.phase }}</ion-label></ion-segment-button>
                }
              </ion-segment>
              @let m = g.parts[+(seg.value ?? 0)].monument;
              <ion-item><ion-label>Size {{ m.size }} · {{ m.duration }} days · knowledge {{ m.knowledge }}</ion-label></ion-item>
              @if (m.residents) {
                <ion-item><ion-label>Needs {{ m.residents }} {{ m.bev }}</ion-label></ion-item>
              }
              @for (good of m.goods; track good[0]) {
                <ion-item><ion-label>{{ name(good[0]) | tr }}</ion-label><ion-label slot="end">{{ good[1] }}</ion-label></ion-item>
              }
            </div>
          </ion-accordion>
        }
      </ion-accordion-group>
    </ion-content>
  `,
})
export class MonumentsPage {
  protected readonly groups = signal<ReturnType<typeof groupMonuments>>([]);

  constructor() {
    fetch('monuments.json')
      .then((r) => r.json() as Promise<Monument[]>)
      .then((all) => this.groups.set(groupMonuments(all)));
  }

  protected name(good: string): string {
    return GOODS[good].name;
  }
}
