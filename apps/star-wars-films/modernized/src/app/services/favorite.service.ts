import { Injectable } from '@angular/core';
import { Preferences } from '@capacitor/preferences';

const STORAGE_KEY = 'favoriteFilms';

@Injectable({ providedIn: 'root' })
export class FavoriteService {
  async getAll(): Promise<string[]> {
    const { value } = await Preferences.get({ key: STORAGE_KEY });
    return value ? (JSON.parse(value) as string[]) : [];
  }

  async isFavorite(filmId: string): Promise<boolean> {
    return (await this.getAll()).includes(filmId);
  }

  async set(filmId: string, favorite: boolean): Promise<void> {
    const others = (await this.getAll()).filter((id) => id !== filmId);
    const next = favorite ? [...others, filmId] : others;
    await Preferences.set({ key: STORAGE_KEY, value: JSON.stringify(next) });
  }
}
