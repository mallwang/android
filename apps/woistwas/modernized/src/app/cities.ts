export interface City {
  zip: string;
  name: string;
  state: string;
  district: string;
  lat: number;
  lon: number;
}

export interface Hit {
  city: City;
  /** Distance in km, only for nearby searches. */
  km?: number;
}

export const MAX_RESULTS = 200;
export const MAX_DISTANCE_KM = 20;

const EARTH_RADIUS_KM = 6371;
const rad = (deg: number) => (deg * Math.PI) / 180;

/** Great-circle distance (haversine) in km. */
export function distanceKm(lat1: number, lon1: number, lat2: number, lon2: number): number {
  const a =
    Math.sin(rad(lat2 - lat1) / 2) ** 2 +
    Math.cos(rad(lat1)) * Math.cos(rad(lat2)) * Math.sin(rad(lon2 - lon1) / 2) ** 2;
  return 2 * EARTH_RADIUS_KM * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
}

/**
 * Search by name (substring) or, if the input contains a digit, by zip code (substring of the digits).
 * Wildcard characters `* % $` are ignored. Empty input yields no results.
 */
export function searchCities(cities: City[], input: string, limit = MAX_RESULTS): City[] {
  let q = input.trim().replace(/[*%$]/g, '');
  if (/\d/.test(q)) q = q.replace(/\D/g, '');
  if (!q) return [];
  const lower = q.toLocaleLowerCase('de');
  const numeric = /^\d+$/.test(q);
  const out: City[] = [];
  for (const c of cities) {
    if (numeric ? c.zip.includes(q) : c.name.toLocaleLowerCase('de').includes(lower)) {
      out.push(c);
      if (out.length === limit) break;
    }
  }
  return out;
}

/** Cities within `maxKm` of the position, nearest first. */
export function nearbyCities(
  cities: City[],
  lat: number,
  lon: number,
  maxKm = MAX_DISTANCE_KM,
  limit = MAX_RESULTS,
): Hit[] {
  const hits: Hit[] = [];
  for (const city of cities) {
    const km = distanceKm(lat, lon, city.lat, city.lon);
    if (km < maxKm) hits.push({ city, km });
  }
  return hits.sort((a, b) => a.km! - b.km!).slice(0, limit);
}
