import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  public constructor(private http: HttpClient) {}

  public getFilms(): Observable<any> {
    return this.http.get('https://swapi.dev/api/films');
  }

  public getFilm(id: string): Observable<any> {
    return this.http.get(`https://swapi.dev/api/films/${id}`);
  }

  public getPeople(): Observable<any> {
    return this.http.get('https://swapi.dev/api/people');
  }

  public getPlanets(): Observable<any> {
    return this.http.get('https://swapi.dev/api/planets');
  }
}
