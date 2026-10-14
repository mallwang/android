import {Injectable} from '@angular/core';
import {Storage} from '@ionic/storage';

const STORAGE_KEY = 'favoriteFilms';

@Injectable({
  providedIn: 'root'
})
export class FavoriteService {
  public constructor(private storage: Storage) {}

  public getAllFavoriteFilms(): Promise<any> {
    return this.storage.get(STORAGE_KEY);
  }

  public isFavorite(filmId: string): Promise<any> {
    return this.getAllFavoriteFilms().then((result) => {
      return result && result.indexOf(filmId) !== -1;
    });
  }

  public favoriteFilm(filmId: string): Promise<any> {
    return this.getAllFavoriteFilms().then((result) => {
      if (result) {
        result.push(filmId);
        return this.storage.set(STORAGE_KEY, result);
      } else {
        return this.storage.set(STORAGE_KEY, [filmId]);
      }
    });
  }

  public unfavoriteFilm(filmId: string): Promise<any> {
    return this.getAllFavoriteFilms().then((result) => {
      if (result) {
        const index = result.indexOf(filmId);
        result.splice(index, 1);
        return this.storage.set(STORAGE_KEY, result);
      }
    });
  }
}
