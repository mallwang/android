export interface SwapiList<T> {
  results: T[];
}

export interface Film {
  title: string;
  episode_id: number;
  opening_crawl: string;
  director: string;
  release_date: string;
  url: string;
}

export interface Named {
  name: string;
}

/** `https://swapi.dev/api/films/4/` -> `4` */
export function idFromUrl(url: string): string {
  return url.split('/').filter(Boolean).pop() ?? '';
}
