import { Component } from '@angular/core';
import { addIcons } from 'ionicons';
import { list, search } from 'ionicons/icons';
import { IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs } from '@ionic/angular';

@Component({
  selector: 'app-tabs',
  imports: [IonIcon, IonLabel, IonTabBar, IonTabButton, IonTabs],
  template: `
    <ion-tabs>
      <ion-tab-bar slot="bottom">
        <ion-tab-button tab="search"
          ><ion-icon name="search" /><ion-label>Suche</ion-label></ion-tab-button
        >
        <ion-tab-button tab="list"
          ><ion-icon name="list" /><ion-label>Gesamtliste</ion-label></ion-tab-button
        >
      </ion-tab-bar>
    </ion-tabs>
  `,
})
export class TabsPage {
  constructor() {
    addIcons({ list, search });
  }
}
