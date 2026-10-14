import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'tabs',
    loadComponent: () => import('./pages/tabs.page').then((m) => m.TabsPage),
    children: [
      {
        path: 'search',
        loadComponent: () => import('./pages/search.page').then((m) => m.SearchPage),
      },
      { path: 'list', loadComponent: () => import('./pages/list.page').then((m) => m.ListPage) },
      { path: '', redirectTo: 'search', pathMatch: 'full' },
    ],
  },
  { path: '**', redirectTo: 'tabs/search' },
];
