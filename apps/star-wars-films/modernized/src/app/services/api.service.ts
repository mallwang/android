import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Film, Named, SwapiList } from '../models';

const BASE_URL = 'https://swapi.dev/api';

@Injectable({ providedIn: 'root' })
export class ApiService {
  private readonly http = inject(HttpClient);

  getFilms() {
    return this.http.get<SwapiList<Film>>(`${BASE_URL}/films`);
  }

  getFilm(id: string) {
    return this.http.get<Film>(`${BASE_URL}/films/${id}`);
  }

  getPeople() {
    return this.http.get<SwapiList<Named>>(`${BASE_URL}/people`);
  }

  getPlanets() {
    return this.http.get<SwapiList<Named>>(`${BASE_URL}/planets`);
  }
}
