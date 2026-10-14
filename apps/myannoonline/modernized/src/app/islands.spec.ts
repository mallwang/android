import { describe, expect, it } from 'vitest';
import islands from '../../public/islands.json';
import { bySize, fertilityLabel, Island } from './islands';

const all = islands as Island[];

describe('islands', () => {
  it('has the legacy counts per size', () => {
    expect(['klein', 'mittel', 'gross', 'riesig'].map((s) => bySize(all, s as Island['size']).length)).toEqual([5, 10, 6, 9]);
  });

  it('labels fertility', () => {
    expect(fertilityLabel(all[0])).toBe('Any fertility');
    expect(fertilityLabel(all.find((i) => i.size === 'riesig' && i.n === 9)!)).toBe('Wheat, Herbs');
  });
});
