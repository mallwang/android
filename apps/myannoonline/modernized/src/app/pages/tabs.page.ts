import { Component } from '@angular/core';
import { IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs } from '@ionic/angular';
import { addIcons } from 'ionicons';
import { calculatorOutline, businessOutline, gridOutline, earthOutline, hammerOutline, informationCircleOutline, linkOutline } from 'ionicons/icons';
import { TrPipe } from '../i18n';

@Component({
  selector: 'app-tabs',
  styles: ['ion-tab-button { min-width: 0; font-size: 10px; }'],
  imports: [TrPipe, IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs],
  template: `
    <ion-tabs>
      <ion-tab-bar slot="bottom">
        <ion-tab-button tab="consumption"><ion-icon name="calculator-outline" /><ion-label>{{ 'Needs' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="chains"><ion-icon name="link-outline" /><ion-label>{{ 'Chains' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="buildings"><ion-icon name="hammer-outline" /><ion-label>{{ 'Buildings' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="supply"><ion-icon name="grid-outline" /><ion-label>{{ 'Supply' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="islands"><ion-icon name="earth-outline" /><ion-label>{{ 'Islands' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="monuments"><ion-icon name="business-outline" /><ion-label>{{ 'Monuments' | tr }}</ion-label></ion-tab-button>
        <ion-tab-button tab="about"><ion-icon name="information-circle-outline" /><ion-label>{{ 'About' | tr }}</ion-label></ion-tab-button>
      </ion-tab-bar>
    </ion-tabs>
  `,
})
export class TabsPage {
  constructor() {
    addIcons({ calculatorOutline, businessOutline, gridOutline, earthOutline, hammerOutline, informationCircleOutline, linkOutline });
  }
}
