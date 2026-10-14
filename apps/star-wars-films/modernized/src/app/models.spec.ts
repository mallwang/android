import { describe, expect, it } from 'vitest';
import { idFromUrl } from './models';

describe('idFromUrl', () => {
  it('extracts the id with or without trailing slash', () => {
    expect(idFromUrl('https://swapi.dev/api/films/4/')).toBe('4');
    expect(idFromUrl('https://swapi.dev/api/films/4')).toBe('4');
  });
});
