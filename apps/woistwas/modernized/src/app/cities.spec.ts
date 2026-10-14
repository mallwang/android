import { describe, expect, it } from 'vitest';
import { City, distanceKm, nearbyCities, searchCities } from './cities';

const c = (zip: string, name: string, lat: number, lon: number): City => ({
  zip,
  name,
  state: 'S',
  district: 'D',
  lat,
  lon,
});
const cities = [
  c('10115', 'Berlin', 52.53, 13.38),
  c('80331', 'München', 48.137, 11.575),
  c('14467', 'Potsdam', 52.4, 13.06),
];

describe('searchCities', () => {
  it('matches names case-insensitively, including umlauts', () => {
    expect(searchCities(cities, ' MÜNCH ').map((x) => x.name)).toEqual(['München']);
  });
  it('matches zip codes by substring and ignores non-digits and wildcards', () => {
    expect(searchCities(cities, '144*').map((x) => x.name)).toEqual(['Potsdam']);
    expect(searchCities(cities, 'D-10115').map((x) => x.name)).toEqual(['Berlin']);
  });
  it('returns nothing for empty input and honors the limit', () => {
    expect(searchCities(cities, '  *')).toEqual([]);
    expect(searchCities(cities, 'e', 1)).toHaveLength(1);
  });
});

describe('nearbyCities', () => {
  it('sorts by distance and respects the radius', () => {
    const hits = nearbyCities(cities, 52.52, 13.4, 50);
    expect(hits.map((h) => h.city.name)).toEqual(['Berlin', 'Potsdam']);
    expect(hits[0].km).toBeLessThan(hits[1].km!);
  });
  it('keeps the nearest when limited', () => {
    expect(nearbyCities(cities, 52.52, 13.4, 50, 1)[0].city.name).toBe('Berlin');
  });
});

describe('distanceKm', () => {
  it('Berlin to Munich is about 504 km', () => {
    expect(distanceKm(52.52, 13.405, 48.137, 11.575)).toBeCloseTo(504, -1);
  });
});
