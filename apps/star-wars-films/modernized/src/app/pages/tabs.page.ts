import { Component } from '@angular/core';
import { addIcons } from 'ionicons';
import { film, people, planet } from 'ionicons/icons';
import { IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs } from '@ionic/angular';

@Component({
  selector: 'app-tabs',
  imports: [IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs],
  template: `
    <ion-tabs>
      <ion-tab-bar slot="bottom">
        <ion-tab-button tab="films"><ion-icon name="film" /><ion-label>Films</ion-label></ion-tab-button>
        <ion-tab-button tab="people"><ion-icon name="people" /><ion-label>People</ion-label></ion-tab-button>
        <ion-tab-button tab="planets"><ion-icon name="planet" /><ion-label>Planets</ion-label></ion-tab-button>
      </ion-tab-bar>
    </ion-tabs>
  `
})
export class TabsPage {
  constructor() {
    addIcons({ film, people, planet });
  }
}
