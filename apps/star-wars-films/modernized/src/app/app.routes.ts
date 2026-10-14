import { Routes } from '@angular/router';

const list = () => import('./pages/list.page').then((m) => m.ListPage);

export const routes: Routes = [
  {
    path: 'tabs',
    loadComponent: () => import('./pages/tabs.page').then((m) => m.TabsPage),
    children: [
      { path: 'films', loadComponent: list, data: { kind: 'films' } },
      {
        path: 'films/:id',
        loadComponent: () => import('./pages/film-details.page').then((m) => m.FilmDetailsPage)
      },
      { path: 'people', loadComponent: list, data: { kind: 'people' } },
      { path: 'planets', loadComponent: list, data: { kind: 'planets' } },
      { path: '', redirectTo: 'films', pathMatch: 'full' }
    ]
  },
  { path: '**', redirectTo: 'tabs/films' }
];
