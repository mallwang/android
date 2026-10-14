import { DatePipe } from '@angular/common';
import { Component, effect, inject, input, signal } from '@angular/core';
import { toObservable, toSignal } from '@angular/core/rxjs-interop';
import { switchMap } from 'rxjs';
import {
  IonBackButton, IonButton, IonButtons, IonCard, IonCardContent, IonCardHeader, IonContent, IonHeader,
  IonIcon, IonItem, IonTitle, IonToolbar
} from '@ionic/angular';
import { addIcons } from 'ionicons';
import { calendar, film as filmIcon, star, starOutline } from 'ionicons/icons';
import { ApiService } from '../services/api.service';
import { FavoriteService } from '../services/favorite.service';
import { shareMailto } from '../share';

@Component({
  selector: 'app-film-details',
  imports: [
    DatePipe, IonBackButton, IonButton, IonButtons, IonCard, IonCardContent, IonCardHeader, IonContent,
    IonHeader, IonIcon, IonItem, IonTitle, IonToolbar
  ],
  template: `
    <ion-header>
      <ion-toolbar color="primary">
        <ion-buttons slot="start"><ion-back-button defaultHref="/tabs/films" /></ion-buttons>
        <ion-title>{{ film()?.title }}</ion-title>
        <ion-buttons slot="end">
          <ion-button (click)="toggleFavorite()" aria-label="Toggle favorite">
            <ion-icon [name]="isFavorite() ? 'star' : 'star-outline'" slot="icon-only" color="secondary" />
          </ion-button>
        </ion-buttons>
      </ion-toolbar>
    </ion-header>
    <ion-content class="ion-padding">
      @if (film(); as f) {
        <ion-card>
          <ion-card-header>Episode {{ f.episode_id }}: {{ f.title }}</ion-card-header>
          <ion-card-content>{{ f.opening_crawl }}</ion-card-content>
          <ion-item lines="none"><ion-icon name="film" slot="start" />Director: {{ f.director }}</ion-item>
          <ion-item lines="none">
            <ion-icon name="calendar" slot="start" />Release Date: {{ f.release_date | date }}
          </ion-item>
        </ion-card>
        <ion-button expand="full" [href]="mailto(f)">Share by Email</ion-button>
      }
    </ion-content>
  `
})
export class FilmDetailsPage {
  readonly id = input.required<string>();

  private readonly api = inject(ApiService);
  private readonly favorites = inject(FavoriteService);

  readonly film = toSignal(toObservable(this.id).pipe(switchMap((id) => this.api.getFilm(id))));
  readonly isFavorite = signal(false);
  readonly mailto = shareMailto;

  constructor() {
    addIcons({ calendar, film: filmIcon, star, starOutline });
    effect(() => {
      this.favorites.isFavorite(this.id()).then((fav) => this.isFavorite.set(fav));
    });
  }

  async toggleFavorite(): Promise<void> {
    const next = !this.isFavorite();
    await this.favorites.set(this.id(), next);
    this.isFavorite.set(next);
  }
}
