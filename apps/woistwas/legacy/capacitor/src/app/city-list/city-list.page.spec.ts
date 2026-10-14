import {async, ComponentFixture, TestBed} from '@angular/core/testing';
import {IonicModule} from '@ionic/angular';

import {CityListPage} from './city-list.page';

describe('CityListPage', () => {
  let component: CityListPage;
  let fixture: ComponentFixture<CityListPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [CityListPage],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(CityListPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
