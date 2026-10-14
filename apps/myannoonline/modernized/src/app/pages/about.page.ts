import { Component, inject } from '@angular/core';
import { IonButton, IonContent, IonHeader, IonItem, IonLabel, IonList, IonListHeader, IonSelect, IonSelectOption, IonTitle, IonToolbar } from '@ionic/angular';
import { CHANGELOG } from '../changelog';
import { I18n, LANGS, TrPipe } from '../i18n';

@Component({
  selector: 'app-about',
  imports: [TrPipe, IonButton, IonContent, IonHeader, IonItem, IonLabel, IonList, IonListHeader, IonSelect, IonSelectOption, IonTitle, IonToolbar],
  template: `
    <ion-header><ion-toolbar color="primary"><ion-title>{{ 'About' | tr }}</ion-title></ion-toolbar></ion-header>
    <ion-content class="ion-padding">
      <h2>myAnnoOnline {{ changelog[0].version }}</h2>
      <ion-select [label]="'Language' | tr" [value]="i18n.lang()" (ionChange)="i18n.set($event.detail.value)">
        @for (l of langs; track l) { <ion-select-option [value]="l">{{ l }}</ion-select-option> }
      </ion-select>
      <p>© 2015 i-use-my-brain.com</p>
      <ion-button href="mailto:feedback.myannoonline@i-use-my-brain.com">{{ 'Give Feedback' | tr }}</ion-button>
      <p>
        The original language of this app is German. If there are any faulty Anno-specific terms or other passages,
        please use the feedback button to let us know. Thank you very much!
      </p>
      <p>
        Anno Online Wiki is a fan project of i-use-my-brain.com. This application is not affiliated with Ubisoft
        Entertainment or Blue Byte, all graphics are subject to the following copyright: © 2012 Ubisoft Entertainment.
        All rights reserved. Anno Online, Blue Byte and the Blue Byte logo are trademarks of Ubisoft Entertainment in
        the USA and/or other countries. Ubisoft and the Ubisoft logo are trademarks of Ubisoft Entertainment in the USA
        and/or other countries. Developed by Blue Byte Software.
      </p>
      <ion-list>
        @for (r of changelog; track r.version) {
          <ion-list-header><ion-label>{{ 'Version' | tr }} {{ r.version }} · {{ r.date }}</ion-label></ion-list-header>
          @for (c of r.changes; track c) {
            <ion-item><ion-label class="ion-text-wrap">{{ c }}</ion-label></ion-item>
          }
        }
      </ion-list>
    </ion-content>
  `,
})
export class AboutPage {
  protected readonly changelog = CHANGELOG;
  protected readonly langs = LANGS;
  protected readonly i18n = inject(I18n);
}
