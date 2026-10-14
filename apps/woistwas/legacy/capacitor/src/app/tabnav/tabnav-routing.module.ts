import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {TabnavPage} from './tabnav.page';

const routes: Routes = [
  {
    path: 'tabnav',
    component: TabnavPage,
    children: [
      {
        path: 'city-list',
        loadChildren: () => import('../city-list/city-list.module').then((m) => m.CityListPageModule)
      },
      {
        path: 'search',
        loadChildren: () => import('../search/search.module').then((m) => m.SearchPageModule)
      }
    ]
  },
  {
    path: '',
    redirectTo: '/tabnav/search'
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TabnavPageRoutingModule {}
