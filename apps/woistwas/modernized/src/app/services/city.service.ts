import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { City } from '../cities';

@Injectable({ providedIn: 'root' })
export class CityService {
  private readonly http = inject(HttpClient);
  private cache?: Promise<City[]>;

  all(): Promise<City[]> {
    return (this.cache ??= firstValueFrom(this.http.get<City[]>('cities.json')));
  }
}
