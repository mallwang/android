import {Component} from '@angular/core';
import {AlertController, LoadingController, ToastController} from '@ionic/angular';
import {cities} from '../../assets/cities';
import {Geolocation, Position} from '@capacitor/geolocation';

@Component({
  selector: 'app-search',
  templateUrl: './search.page.html',
  styleUrls: ['./search.page.scss']
})
export class SearchPage {
  private allCities = cities;
  public foundCitites = [];
  public numbersPerIteration = 200;
  private countInfinites: number;
  private displayedCities = 0;
  public statusMessage = '';
  public maxDistanceKm = 20;

  /**
   * Return the current position of the users device.
   * @return {Promise<Position>} The position object.
   * @private
   */
  private static async getCurrentPosition(): Promise<Position> {
    const coordinates = await Geolocation.getCurrentPosition({
      enableHighAccuracy: true,
      maximumAge: 1
    });
    return coordinates;
  }

  public constructor(
    public readonly loadingController: LoadingController,
    public readonly alertController: AlertController,
    public readonly toastCtrl: ToastController
  ) {
    this.statusMessage = 'Suche nach einem Ort oder benutze die GPS-Suche.';
  }

  /**
   * Filter the list of cities by the given search string.
   * @param {any} searchString: The string to be searched.
   */
  public async filterCities(searchString: any): Promise<void> {
    // Reset cities
    this.foundCitites = [];

    // Trim all spaces
    searchString = searchString.trim();

    // If search string contains a number -> delete non numeric chars
    if (/\d/.test(searchString)) {
      searchString = searchString.replace(/[^0-9]/g, '');
    }

    // iIf someone uses a wildcard -> replace it
    searchString = searchString.replace(/\*/g, '');
    searchString = searchString.replace(/%/g, '');
    searchString = searchString.replace(/\$/g, '');

    let tempStaedte = [];
    if (isNaN(searchString)) {
      tempStaedte = this.allCities.filter((stadt) => {
        return stadt[1].toLowerCase().indexOf(searchString.toLowerCase()) > -1;
      });
    } else {
      tempStaedte = this.allCities.filter((stadt) => {
        return stadt[0].indexOf(searchString.toLowerCase()) > -1;
      });
    }

    this.filter(tempStaedte);
  }

  /**
   * Click event handler for the location button.
   */
  public async filterByCurrentLocation(): Promise<void> {
    // Reset cities
    this.foundCitites = [];

    // Display loading indicator
    const loading = await this.loadingController.create({
      message: 'Standort wird gesucht...'
    });
    await loading.present();

    // Get the current position
    let latitude = 0;
    let longitude = 0;
    try {
      const currentPosition = await SearchPage.getCurrentPosition();
      latitude = Number(currentPosition.coords.latitude.toFixed(5));
      longitude = Number(currentPosition.coords.longitude.toFixed(5));
      // console.log(`latitude: ${latitude} / longitude: ${longitude}`);
    } catch (error) {
      console.error(error);
      await loading.dismiss();
      if (error.code === 1) {
        await this.presentAlert('Zugriff verweigert', 'Bitte berechtige die App deinen Standort abzurufen.');
      } else {
        await this.presentAlert('Fehler', 'Dein aktueller Standort konnte nicht ermittelt werden.');
      }
    }

    // Filter all cities by their maximum distance to the current location
    const tempStaedte = this.allCities.filter((stadt) => {
      const distanceToCurrentPosition = this.getDistanceFromLatLonInKm(
        latitude,
        longitude,
        parseFloat(stadt[4]),
        parseFloat(stadt[5])
      ).toFixed(2);
      // Add the current distance to the city name (to be displayed in the item)
      stadt[6] = String(distanceToCurrentPosition);
      return Number(distanceToCurrentPosition) < this.maxDistanceKm;
    });

    this.filter(tempStaedte);

    await loading.dismiss();
  }

  /**
   * Filter the list of available cities by the found ones and sort them by distance.
   * @param {Array<Array<string>>} tempStaedte: The list of available cities which are located within the defined distance.
   * @private
   */
  private filter(tempStaedte: Array<Array<string>>): any {
    if (tempStaedte.length > 0) {
      this.countInfinites = 1;
      const amountOfNextCities =
        tempStaedte.length < this.numbersPerIteration ? tempStaedte.length : this.numbersPerIteration;
      for (let i = 0; i < amountOfNextCities; i++) {
        this.foundCitites.push(tempStaedte[i]);
        this.displayedCities++;
      }
      // Sort foundStaedte by distance
      this.foundCitites.sort((a: Array<string>, b: Array<string>): number => {
        return Number(a[6]) - Number(b[6]);
      });
      this.statusMessage = null;
    } else {
      this.statusMessage =
        'Es wurde kein Ort gefunden. Bitte überprüfe deinen Standort oder ändere deinen Suchbegriff.';
    }
  }

  /**
   * Calculates the distance between two geolocations based on its latitudes and longitudes.
   * @param {number} latitudeLocation1: Latitude of the first geolocation.
   * @param {number} longitudeLocation1: Longitude of the first geolocation.
   * @param {number} latitudeLocation2: Latitude of the second geolocation.
   * @param {number} longitudeLocation2: Longitude of the second geolocation.
   * @return {number} The distance between the geolocations in km.
   * @private
   */
  private getDistanceFromLatLonInKm(
    latitudeLocation1: number,
    longitudeLocation1: number,
    latitudeLocation2: number,
    longitudeLocation2: number
  ): number {
    const earthRadiusKm = 6371;
    const distanceLatitude = this.convertDegreeToRadius(latitudeLocation2 - latitudeLocation1);
    const distanceLongitude = this.convertDegreeToRadius(longitudeLocation2 - longitudeLocation1);
    const a =
      Math.sin(distanceLatitude / 2) * Math.sin(distanceLatitude / 2) +
      Math.cos(this.convertDegreeToRadius(latitudeLocation1)) *
        Math.cos(this.convertDegreeToRadius(latitudeLocation2)) *
        Math.sin(distanceLongitude / 2) *
        Math.sin(distanceLongitude / 2);
    const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    const distanceKm = earthRadiusKm * c; // Distance in km
    return distanceKm;
  }

  /**
   * Converts a geolocation degree to the earth radius at this location.
   * @param {number} degree: The geolocation degree.
   * @return {number} The earth radius at the given degree.
   * @private
   */
  private convertDegreeToRadius(degree: number): number {
    return degree * (Math.PI / 180);
  }

  /**
   * Create an alert and display it to the user.
   * @param {string} alertHeader: The header of the alert.
   * @param {string} alertSubHeader: The subheader of the alert.
   * @private
   */
  private async presentAlert(alertHeader: string, alertSubHeader: string): Promise<void> {
    const alert = await this.alertController.create({
      header: alertHeader,
      subHeader: alertSubHeader,
      buttons: ['OK']
    });

    await alert.present();
  }
}
