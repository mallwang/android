export interface Building {
  id: string;
  category: 'production' | 'shop' | 'infrastructure' | 'attraction';
  name: string;
  /** Resident tier needed to unlock; null for none. */
  population: 'bauer' | 'handwerker' | 'kaufmann' | 'adliger' | null;
  residents: number;
  special: number;
  upkeep: number;
  radius: number;
  size: string;
  /** Production time in seconds. */
  duration: number;
  /** As shown in the legacy app, e.g. "10.2k". */
  cost: string;
  /** Construction materials: wood, stone, tools, glass. */
  resources: [number, number, number, number];
  level?: number;
  utilization?: string;
  /** Good produced (key of GOODS). */
  product?: string;
}

export const MATERIALS = ['Wood', 'Stone', 'Tools', 'Glass'];

export const CATEGORY_NAMES: Record<Building['category'], string> = {
  production: 'Production', shop: 'Shop', infrastructure: 'Infrastructure', attraction: 'Attractions',
};

export const byCategory = (all: Building[], category: Building['category']): Building[] =>
  all.filter((b) => b.category === category);

export const producers = (all: Building[], good: string): Building[] =>
  all.filter((b) => b.product === good);
