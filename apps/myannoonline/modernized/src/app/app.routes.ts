import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/tabs.page').then((m) => m.TabsPage),
    children: [
      { path: 'consumption', loadComponent: () => import('./pages/consumption.page').then((m) => m.ConsumptionPage) },
      { path: 'chains', loadComponent: () => import('./pages/chains.page').then((m) => m.ChainsPage) },
      { path: 'buildings', loadComponent: () => import('./pages/buildings.page').then((m) => m.BuildingsPage) },
      { path: 'islands', loadComponent: () => import('./pages/islands.page').then((m) => m.IslandsPage) },
      { path: 'about', loadComponent: () => import('./pages/about.page').then((m) => m.AboutPage) },
      { path: 'supply', loadComponent: () => import('./pages/supply.page').then((m) => m.SupplyPage) },
      { path: 'monuments', loadComponent: () => import('./pages/monuments.page').then((m) => m.MonumentsPage) },
      { path: '', redirectTo: 'consumption', pathMatch: 'full' },
    ],
  },
  { path: '**', redirectTo: 'consumption' },
];
