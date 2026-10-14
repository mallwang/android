import { describe, expect, it } from 'vitest';
import data from '../../public/buildings.json';
import { Building, producers } from './buildings';
import { GOODS } from './goods';
import { INPUTS, PROD_TIME } from './consumption';

const all = data as Building[];

describe('buildings data', () => {
  it('has unique ids and only known goods', () => {
    expect(new Set(all.map((b) => b.id)).size).toBe(all.length);
    for (const b of all) if (b.product) expect(GOODS[b.product], b.id).toBeDefined();
  });

  it('has a name and four construction resources for every building', () => {
    for (const b of all) {
      expect(b.name, b.id).toBeTruthy();
      expect(b.resources, b.id).toHaveLength(4);
    }
  });

  it('every produced good has a building, and production time matches', () => {
    for (const good of Object.keys(PROD_TIME)) {
      const [first] = producers(all, good);
      if (first) expect(first.duration, good).toBe(PROD_TIME[good]);
    }
    for (const good of Object.keys(INPUTS)) expect(producers(all, good).length, good).toBeGreaterThan(0);
  });

  it('does not copy the legacy Kontor level 1 resources bug', () => {
    expect(all.find((b) => b.id === 'kontor_lvl1')?.resources).toEqual([0, 0, 0, 0]);
  });
});
