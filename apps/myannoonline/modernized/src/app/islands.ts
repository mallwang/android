export interface Island {
  size: 'klein' | 'mittel' | 'gross' | 'riesig';
  n: number;
  image: string;
  /** Image of the deposits on the island. */
  deposits: string;
  /** True if the deposits are only possible ones, not fixed. */
  allDeposits: boolean;
  /** Fertility goods, or 'all' if any is possible. */
  fertility: string[] | 'all';
  rubies: number;
}

export const SIZE_NAMES: Record<Island['size'], string> = {
  klein: 'Small',
  mittel: 'Medium',
  gross: 'Large',
  riesig: 'Huge',
};

export function fertilityLabel(island: Island): string {
  return island.fertility === 'all' ? 'Any fertility' : island.fertility.join(', ');
}

export function bySize(all: Island[], size: Island['size']): Island[] {
  return all.filter((i) => i.size === size);
}
