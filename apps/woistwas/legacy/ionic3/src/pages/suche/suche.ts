import {Component, ViewChild} from '@angular/core';
import {Content, LoadingController, AlertController, ToastController} from 'ionic-angular';
import { Geolocation } from '@ionic-native/geolocation';
import { Clipboard } from '@ionic-native/clipboard';
import {staedte} from "../../assets/staedteAlphabetisch";

@Component({
  selector: 'page-suche',
  templateUrl: 'suche.html'
})
export class SuchePage {

  @ViewChild(Content) content: Content;
  searchQuery: string = '';
  alleStaedte: string[][];
  tempStaedte: string[][];
  foundStaedte: string[][];
  numbersPerIteration: number;
  countInfinites: number;
  displayedCities: number;

  constructor(private clipboard: Clipboard, public loadingCtrl: LoadingController, private geolocation: Geolocation, private alertCtrl: AlertController, public toastCtrl: ToastController) {
    this.alleStaedte = staedte;
    this.numbersPerIteration = 40;
    this.initializeItems();
    if (this.foundStaedte.length === 0) {
      this.foundStaedte = [
        ["Suche", "nach einem Ort", "oder benutze die GPS-Suche", ""]
      ];
    }
  }

  initializeItems() {
    // this.alleStaedte = staedte;
    this.tempStaedte = [];
    this.foundStaedte = [];
    this.displayedCities = 0;
    // for (let i = 0; i < this.numbersPerIteration; i++) {
    //   // console.log(`show element ${i} of staedte`);
    //   this.tempStaedte.push(this.alleStaedte[i]);
    // }
  }

  getItems(ev: any) {
    let loading = this.loadingCtrl.create({
      content: 'Durchsuche 16727 Städte...'
    });
    loading.present();

    // Reset items back to all of the items
    this.initializeItems();

    // set val to the value of the searchbar
    let val = ev.target.value;

    // if the value is an empty string don't filter the items
    if (val && val.trim().length >= 2) {

      // trim all spaces
      val = val.trim();

      // if search string contains a number -> delete non numeric chars
      if(/\d/.test(val)) {
        val = val.replace(/[^0-9\.]/g, '');
        // console.log(`val: ${val}`);
      }

      // if someone uses a wildcard -> replace it
      console.log(`val: ${val}`);
      val = val.replace(/\*/g, "");
      val = val.replace(/%/g, "");
      val = val.replace(/\$/g, "");
      // console.log(`val: ${val}`);

      if (isNaN(val)) {
        this.tempStaedte = this.alleStaedte.filter((stadt) => {
          return (stadt[1].toLowerCase().indexOf(val.toLowerCase()) > -1);
        })
      } else {
        this.tempStaedte = this.alleStaedte.filter((stadt) => {
          return (stadt[0].indexOf(val.toLowerCase()) > -1);
        })
      }
      this.content.scrollToTop();
      // console.log(`this.tempStaedte.length: ${this.tempStaedte.length}`);

      if (this.tempStaedte.length > 0) {
        this.countInfinites = 1;
        let amountOfNextCities = this.tempStaedte.length < this.numbersPerIteration ? this.tempStaedte.length : this.numbersPerIteration;
        for (let i = 0; i < amountOfNextCities; i++) {
          // console.log(`show element ${i} of staedte`);
          this.foundStaedte.push(this.tempStaedte[i]);
          this.displayedCities++;
        }
      } else {
        this.foundStaedte = [
          ["Keinen", "Ort gefunden", "Bitte passe deine Suche an", ""]
        ];
      }
    } else {
      let alert = this.alertCtrl.create({
        title: '',
        subTitle: 'Bitte gib mindestens zwei Zeichen ein.',
        buttons: ['Ok']
      });
      alert.present();
      this.foundStaedte = [
        ["Suche", "nach einem Ort", "oder benutze die GPS-Suche", ""]
      ];
    }

    loading.dismiss();
  }

  filterByLocation(ev: any) {
    // console.log("Event: ", ev);
    let loading = this.loadingCtrl.create({
      content: 'Standort wird gesucht...'
    });
    loading.present();

    // Reset items back to all of the items
    this.initializeItems();

    this.geolocation.getCurrentPosition().then((resp) => {
      let latitude = Number((resp.coords.latitude).toFixed(5));
      let longitude = Number((resp.coords.longitude).toFixed(5));
      let distance = 12;

      this.tempStaedte = this.alleStaedte.filter((stadt) => {
        let distance2 = Number(this.getDistanceFromLatLonInKm(latitude, longitude, parseFloat(stadt[4]), parseFloat(stadt[5])));
        stadt[2] = stadt[2].split(" - ")[0];
        stadt[2] += " - " + distance2.toFixed(1) + " km entfernt";
        return (distance2 < distance);
      });

      this.content.scrollToTop();
      // console.log(`this.tempStaedte.length: ${this.tempStaedte.length}`);

      if (this.tempStaedte.length > 0) {
        this.countInfinites = 1;
        let amountOfNextCities = this.tempStaedte.length < this.numbersPerIteration ? this.tempStaedte.length : this.numbersPerIteration;
        for (let i = 0; i < amountOfNextCities; i++) {
          // console.log(`show element ${i} of staedte`);
          this.foundStaedte.push(this.tempStaedte[i]);
          this.displayedCities++;
        }
      } else {
        this.foundStaedte = [
          ["Keinen", "Ort gefunden", "oder überprüfe deinen Standort", "Bitte versuche es erneut"]
        ];
      }
      loading.dismiss();

    }).catch((error) => {
      console.log('Error getting location', error);
      if (error.message === "Illegal Access") {
        this.foundStaedte = [
          ["Dein", "Standort konnte nicht ermittelt werden", "", "", "", ""]
        ];
        loading.dismiss();

        let alert = this.alertCtrl.create({
          title: 'Zugriff verweigert',
          subTitle: 'Bitte berechtige die App deinen Standort abzurufen.',
          buttons: ['Ok'],
          enableBackdropDismiss: false
        });
        alert.present();
      } else {
        loading.dismiss();
      }
    });
  };

  getDistanceFromLatLonInKm(lat1, lon1, lat2, lon2) {
    let R = 6371; // Radius of the earth in km
    let dLat = this.deg2rad(lat2-lat1);  // deg2rad below
    let dLon = this.deg2rad(lon2-lon1);
    let a =
      Math.sin(dLat/2) * Math.sin(dLat/2) +
      Math.cos(this.deg2rad(lat1)) * Math.cos(this.deg2rad(lat2)) *
      Math.sin(dLon/2) * Math.sin(dLon/2)
    ;
    let c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
    let d = R * c; // Distance in km
    return d;
  }

  deg2rad(deg) {
    return deg * (Math.PI/180)
  }

  doInfinite(infiniteScroll) {
    // console.log('Begin async operation');

    setTimeout(() => {
      let amountOfNextCities = this.tempStaedte.length <= ((this.countInfinites+1)*this.numbersPerIteration) ? this.tempStaedte.length-(this.countInfinites*this.numbersPerIteration) : this.numbersPerIteration;
      // console.log(`this.tempStaedte.length: ${this.tempStaedte.length}`);
      // console.log(`amountOfNextCities: ${amountOfNextCities}`);
      // console.log(`displayedCities: ${(this.countInfinites*this.numbersPerIteration)+amountOfNextCities}`);
      for (let i = 0; i < amountOfNextCities; i++) {
        // console.log(`show element ${(this.countInfinites*this.numbersPerIteration)+i} of staedte`);
        this.foundStaedte.push(this.tempStaedte[(this.countInfinites*this.numbersPerIteration)+i]);
        this.displayedCities++;
      }

      // console.log('Async operation has ended');
      this.countInfinites++;
      infiniteScroll.complete();
    }, 250);
  }

  copyContent(content: string) {
    this.clipboard.copy(content);
    let toast = this.toastCtrl.create({
      message: `'${content}' in die Zwischenablage kopiert`,
      duration: 3000
    });
    toast.present();
  }

}
