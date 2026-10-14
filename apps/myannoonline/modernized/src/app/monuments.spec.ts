import { describe, expect, it } from 'vitest';
import data from '../../public/monuments.json';
import { groupMonuments, Monument } from './monuments';

describe('monuments', () => {
  it('groups the 33 legacy entries into 10 named monuments', () => {
    const all: Monument[] = data as Monument[];
    const groups = groupMonuments(all);
    expect(all.length).toBe(33);
    expect(groups.length).toBe(10);
    expect(groups.every((g) => g.name && g.parts.every((p) => p.phase))).toBe(true);
    expect(groups[0].parts.map((p) => p.phase)).toEqual(['Total', 'Phase 1', 'Phase 2']);
  });
});
