import { Component } from '@angular/core';

import { GesamtPage } from '../gesamt/gesamt';
import { SuchePage } from '../suche/suche';
import { FavPage } from '../fav/fav';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tab1Root = SuchePage;
  tab2Root = GesamtPage;
  tab3Root = FavPage;

  constructor() {

  }
}
