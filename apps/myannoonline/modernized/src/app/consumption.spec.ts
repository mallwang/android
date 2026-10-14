import { describe, expect, it } from 'vitest';
import { RATES, calculate, chain, formatUtilization, supply } from './consumption';

describe('consumption', () => {
  it('has one non-zero rate per legacy verbr_* constant (spices are never calculated there)', () => {
    expect(Object.values(RATES).flat().filter((r) => r > 0).length).toBe(34);
  });

  it('derives the supply table from rates and production times', () => {
    const row = (g: string) => [0, 1, 2, 3].map((t) => supply(g, t));
    expect(row('fisch')).toEqual([649, 909, 1090, 1239]);
    expect(row('brot')).toEqual([0, 545, 681, 757]);
    expect(row('fleisch')).toEqual([0, 0, 0, 280]);
  });

  it('truncates utilization instead of rounding', () => {
    expect(formatUtilization(85.99)).toBe('85.9');
    expect(formatUtilization(100)).toBe('100');
  });

  it('computes fish for 1000 pioneers', () => {
    // 1000 * .00042 = 0.42/tick; fisherman makes 30/110 = 0.2727/tick -> 2 huts at 77%
    const fisch = calculate([1000, 0, 0, 0]).find((n) => n.good === 'fisch');
    expect(fisch).toEqual({ good: 'fisch', count: 2, utilization: '77' });
  });

  it('only lists consumed goods', () => {
    expect(calculate([100, 0, 0, 0]).map((n) => n.good)).toEqual(['fisch', 'milch', 'wollgewaender']);
  });

  it('sums shared upstream demand in the wine chain', () => {
    const holz = chain('wein', [0, 0, 0, 5000]).find((n) => n.good === 'holz');
    expect(holz!.count).toBeGreaterThan(0);
  });
});
