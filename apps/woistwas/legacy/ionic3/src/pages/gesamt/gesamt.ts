import { Component } from '@angular/core';
import {staedte} from "../../assets/staedteAlphabetisch";

@Component({
  selector: 'page-gesamt',
  templateUrl: 'gesamt.html'
})
export class GesamtPage {

  staedte: string[][];
  tempStaedte: string[][];
  countInfinites: number;
  numbersPerIteration: number;

  constructor() {
    this.initializeItems();
  }

  initializeItems() {
    this.staedte = staedte;
    this.tempStaedte = [];
    this.numbersPerIteration = 40;
    this.countInfinites = 1;
    for (let i = 0; i < this.numbersPerIteration; i++) {
      // console.log(`show element ${i} of staedte`);
      this.tempStaedte.push(this.staedte[i]);
    }
  }

  doInfinite(infiniteScroll) {
    // console.log('Begin async operation');

    setTimeout(() => {
      for (let i = 0; i < this.numbersPerIteration; i++) {
        // console.log(`show element ${(this.countInfinites*this.numbersPerIteration)+i} of staedte`);
        this.tempStaedte.push(this.staedte[(this.countInfinites*this.numbersPerIteration)+i]);
      }

      // console.log('Async operation has ended');
      this.countInfinites++;
      infiniteScroll.complete();
    }, 250);
  }

  clickEvent(stadt: string[]) {
    // console.log(`clicked: ${stadt}`);
  }

  pressEvent(stadt: string[]) {
    // console.log(`open options window for stadt: ${stadt}`);
  }

}
