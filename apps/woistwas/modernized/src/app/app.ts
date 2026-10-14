import { Component } from '@angular/core';
import { Capacitor } from '@capacitor/core';
import { StatusBar, Style } from '@capacitor/status-bar';
import { IonApp, IonRouterOutlet } from '@ionic/angular';

@Component({
  selector: 'app-root',
  imports: [IonApp, IonRouterOutlet],
  template: `<ion-app><ion-router-outlet /></ion-app>`,
})
export class App {
  constructor() {
    if (Capacitor.isNativePlatform()) {
      StatusBar.setBackgroundColor({ color: '#FFA500' });
      StatusBar.setStyle({ style: Style.Dark });
    }
  }
}
