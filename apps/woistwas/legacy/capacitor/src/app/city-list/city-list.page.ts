import {Component} from '@angular/core';
import {cities} from '../../assets/cities';

@Component({
  selector: 'app-city-list',
  templateUrl: './city-list.page.html',
  styleUrls: ['./city-list.page.scss']
})
export class CityListPage {
  public cities: Array<Array<string>>;
  public tempCities: Array<Array<string>>;
  private countInfinites: number;
  private numbersPerIteration: number;

  public constructor() {
    this.initializeItems();
  }

  private initializeItems(): void {
    this.cities = cities;
    this.tempCities = [];
    this.numbersPerIteration = 40;
    this.countInfinites = 1;
    for (let i = 0; i < this.numbersPerIteration; i++) {
      this.tempCities.push(this.cities[i]);
    }
  }

  public doInfinite(event: any): void {
    // console.log('Begin async operation');

    setTimeout(() => {
      for (let i = 0; i < this.numbersPerIteration; i++) {
        // console.log(`show element ${(this.countInfinites * this.numbersPerIteration) + i} of staedte`);
        this.tempCities.push(this.cities[this.countInfinites * this.numbersPerIteration + i]);
      }

      // console.log('Async operation has ended');
      this.countInfinites++;
      event.target.complete();
    }, 250);
  }

  public clickEvent(city: Array<string>): void {
    console.log(`city clicked: ${city}`);
  }

  public pressEvent(city: Array<string>): void {
    console.log(`city pressed: ${city}`);
  }
}
