import { Component, computed, signal } from '@angular/core';
import {
  IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonSegment, IonSegmentButton,
  IonTitle, IonToolbar,
} from '@ionic/angular';
import { Building, byCategory, CATEGORY_NAMES } from '../buildings';
import { BuildingDetailComponent } from './building-detail.component';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-buildings',
  imports: [TrPipe, 
    BuildingDetailComponent, IonAccordion, IonAccordionGroup, IonContent, IonHeader, IonItem, IonLabel, IonSegment,
    IonSegmentButton, IonTitle, IonToolbar,
  ],
  template: `
    <ion-header>
      <ion-toolbar color="primary"><ion-title>{{ 'Buildings' | tr }}</ion-title></ion-toolbar>
      <ion-toolbar>
        <ion-segment [value]="category()" (ionChange)="category.set($any($event.detail.value))" scrollable>
          @for (c of categories; track c[0]) {
            <ion-segment-button [value]="c[0]"><ion-label>{{ c[1] | tr }}</ion-label></ion-segment-button>
          }
        </ion-segment>
      </ion-toolbar>
    </ion-header>
    <ion-content>
      <ion-accordion-group>
        @for (b of shown(); track b.id) {
          <ion-accordion [value]="b.id">
            <ion-item slot="header"><ion-label>{{ b.name | tr }}{{ b.level ? ' · ' + ('Level' | tr) + ' ' + b.level : '' }}</ion-label></ion-item>
            <div slot="content"><app-building-detail [building]="b" /></div>
          </ion-accordion>
        }
      </ion-accordion-group>
    </ion-content>
  `,
})
export class BuildingsPage {
  protected readonly categories = Object.entries(CATEGORY_NAMES);
  protected readonly category = signal<Building['category']>('production');
  private readonly all = signal<Building[]>([]);
  protected readonly shown = computed(() => byCategory(this.all(), this.category()));

  constructor() {
    fetch('buildings.json')
      .then((r) => r.json() as Promise<Building[]>)
      .then((all) => this.all.set(all));
  }
}
