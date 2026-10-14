import { Component, computed, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Preferences } from '@capacitor/preferences';
import {
  IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonInput, IonItem, IonLabel, IonList,
  IonTitle, IonToolbar,
} from '@ionic/angular';
import { GOODS } from '../goods';
import { calculate, chain, Population } from '../consumption';
import { TrPipe } from '../i18n';

const TIERS = ['Pioneers', 'Settlers', 'Merchants', 'Nobles'];
const KEY = 'population';

@Component({
  selector: 'app-consumption',
  imports: [TrPipe, 
    FormsModule, IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonInput, IonItem, IonLabel,
    IonList, IonTitle, IonToolbar,
  ],
  template: `
    <ion-header><ion-toolbar color="primary"><ion-title>{{ 'Needs' | tr }}</ion-title></ion-toolbar></ion-header>
    <ion-content>
      <ion-list>
        @for (tier of tiers; track tier; let i = $index) {
          <ion-item>
            <ion-input type="number" min="0" inputmode="numeric" [label]="tier | tr" labelPlacement="floating"
              [ngModel]="pop()[i] || null" (ngModelChange)="set(i, $event)" />
          </ion-item>
        }
      </ion-list>
      <ion-accordion-group>
        @for (n of needs(); track n.good) {
          <ion-accordion [value]="n.good">
            <ion-item slot="header">
              <ion-label>{{ label(n.good) | tr }}</ion-label>
              <ion-label slot="end">{{ n.count }}x ({{ n.utilization }}%)</ion-label>
            </ion-item>
            <div slot="content">
              @for (c of chain(n.good); track c.good) {
                <ion-item><ion-label>{{ label(c.good) | tr }}</ion-label>
                  <ion-label slot="end">{{ c.count }}x ({{ c.utilization }}%)</ion-label></ion-item>
              }
            </div>
          </ion-accordion>
        }
      </ion-accordion-group>
    </ion-content>
  `,
})
export class ConsumptionPage {
  protected readonly tiers = TIERS;
  protected readonly pop = signal<Population>([0, 0, 0, 0]);
  protected readonly needs = computed(() => calculate(this.pop()));

  constructor() {
    Preferences.get({ key: KEY }).then(({ value }) => value && this.pop.set(JSON.parse(value)));
  }

  protected chain(good: string) {
    return chain(good, this.pop());
  }

  protected label(good: string): string {
    const g = GOODS[good];
    return g.building ? `${g.building} (${g.name})` : g.name;
  }

  protected set(i: number, value: string | number | null): void {
    const next = [...this.pop()] as Population;
    next[i] = Math.max(0, Math.floor(Number(value) || 0));
    this.pop.set(next);
    Preferences.set({ key: KEY, value: JSON.stringify(next) });
  }
}
