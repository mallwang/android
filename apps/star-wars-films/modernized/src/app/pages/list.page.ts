import { Component, computed, inject, input } from '@angular/core';
import { toObservable, toSignal } from '@angular/core/rxjs-interop';
import { Router } from '@angular/router';
import { IonContent, IonHeader, IonItem, IonList, IonTitle, IonToolbar } from '@ionic/angular';
import { Observable, catchError, map, of, switchMap } from 'rxjs';
import { idFromUrl } from '../models';
import { ApiService } from '../services/api.service';

type Kind = 'films' | 'people' | 'planets';

interface Row {
  label: string;
  filmId?: string;
}

/** One page for the three tabs; `kind` comes from the route data. */
@Component({
  selector: 'app-list',
  imports: [IonContent, IonHeader, IonItem, IonList, IonTitle, IonToolbar],
  template: `
    <ion-header>
      <ion-toolbar color="primary"><ion-title>{{ title() }}</ion-title></ion-toolbar>
    </ion-header>
    <ion-content>
      @if (failed()) {
        <p class="ion-padding">Could not load data. Check your connection.</p>
      }
      <ion-list>
        @for (row of rows(); track row.label) {
          <ion-item [button]="!!row.filmId" [detail]="!!row.filmId" lines="inset" (click)="open(row)">
            {{ row.label }}
          </ion-item>
        }
      </ion-list>
    </ion-content>
  `
})
export class ListPage {
  readonly kind = input.required<Kind>();

  private readonly api = inject(ApiService);
  private readonly router = inject(Router);

  readonly title = computed(() => this.kind().charAt(0).toUpperCase() + this.kind().slice(1));
  readonly failed = computed(() => this.data()?.failed ?? false);
  readonly rows = computed(() => this.data()?.rows ?? []);

  private readonly data = toSignal(
    toObservable(this.kind).pipe(
      switchMap((kind) => this.load(kind)),
    ),
  );

  open(row: Row): void {
    if (row.filmId) this.router.navigate(['/tabs/films', row.filmId]);
  }

  private load(kind: Kind) {
    const rows$: Observable<Row[]> =
      kind === 'films'
        ? this.api.getFilms().pipe(map((r) => r.results.map((f) => ({ label: f.title, filmId: idFromUrl(f.url) }))))
        : (kind === 'people' ? this.api.getPeople() : this.api.getPlanets()).pipe(
            map((r) => r.results.map((n) => ({ label: n.name })))
          );
    return rows$.pipe(
      map((rows) => ({ rows, failed: false })),
      catchError(() => of({ rows: [] as Row[], failed: true }))
    );
  }
}
