import { Component, computed, inject, signal } from '@angular/core';
import { IonContent, IonHeader, IonItem, IonLabel, IonSegment, IonSegmentButton, IonTitle, IonToolbar } from '@ionic/angular';
import { bySize, Island, SIZE_NAMES } from '../islands';
import { I18n, TrPipe } from '../i18n';

@Component({
  selector: 'app-islands',
  imports: [TrPipe, IonContent, IonHeader, IonItem, IonLabel, IonSegment, IonSegmentButton, IonTitle, IonToolbar],
  template: `
    <ion-header>
      <ion-toolbar color="primary"><ion-title>{{ 'Islands' | tr }}</ion-title></ion-toolbar>
      <ion-toolbar>
        <ion-segment [value]="size()" (ionChange)="size.set($any($event.detail.value))">
          @for (s of sizes; track s[0]) {
            <ion-segment-button [value]="s[0]"><ion-label>{{ s[1] | tr }}</ion-label></ion-segment-button>
          }
        </ion-segment>
      </ion-toolbar>
    </ion-header>
    <ion-content>
      @for (i of shown(); track i.n) {
        <ion-item>
          <img slot="start" [src]="i.image" width="96" alt="" />
          <ion-label>
            <p>{{ (i.allDeposits ? 'Possible deposits' : 'Deposits') | tr }}</p>
            <img [src]="i.deposits" alt="" />
            <p>{{ label(i) }}</p>
            @if (i.rubies) {
              <p>{{ i.rubies }} <img src="islands/rubin.png" height="14" alt="rubies" /></p>
            }
          </ion-label>
        </ion-item>
      }
    </ion-content>
  `,
})
export class IslandsPage {
  protected readonly sizes = Object.entries(SIZE_NAMES);
  protected readonly size = signal<Island['size']>('klein');
  private readonly i18n = inject(I18n);
  protected label(i: Island): string {
    return i.fertility === 'all' ? this.i18n.t('Any fertility') : i.fertility.map((f) => this.i18n.t(f)).join(', ');
  }
  private readonly all = signal<Island[]>([]);
  protected readonly shown = computed(() => bySize(this.all(), this.size()));

  constructor() {
    fetch('islands.json')
      .then((r) => r.json() as Promise<Island[]>)
      .then((all) => this.all.set(all));
  }
}
