import { Component, input } from '@angular/core';
import { IonItem, IonLabel } from '@ionic/angular';
import { Building, MATERIALS } from '../buildings';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-building-detail',
  imports: [TrPipe, IonItem, IonLabel],
  template: `
    @let b = building();
    <ion-item><ion-label>{{ 'Size' | tr }} {{ b.size }} · radius {{ b.radius }} · upkeep {{ b.upkeep }}</ion-label></ion-item>
    @if (b.duration) {
      <ion-item><ion-label>Production time {{ b.duration }} s</ion-label></ion-item>
    }
    @if (b.residents) {
      <ion-item><ion-label>Needs {{ b.residents }} residents</ion-label></ion-item>
    }
    <ion-item><ion-label>{{ 'Cost' | tr }} {{ b.cost }} @for (m of b.resources; track $index) { @if (m) { · {{ m }} {{ materials[$index] }} } }</ion-label></ion-item>
  `,
})
export class BuildingDetailComponent {
  readonly building = input.required<Building>();
  protected readonly materials = MATERIALS;
}
