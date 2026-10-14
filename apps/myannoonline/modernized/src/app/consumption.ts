/** Pure calculation logic ported from the legacy Verbrauchsrechner/FragVerbrauch. */

export const TICK_SECONDS = 30;

export type Population = [bauern: number, handwerker: number, kaufleute: number, adlige: number];

/** Consumption per resident and tick (0 = tier does not consume the good). */
export const RATES: Record<string, Population> = {
  fisch: [0.00042, 0.0003, 0.00025, 0.00022],
  brot: [0, 0.00025, 0.0002, 0.00018],
  fleisch: [0, 0, 0, 0.00017],
  milch: [0.0005, 0.00036, 0.0003, 0.00026],
  most: [0, 0.00022, 0.00018, 0.00016],
  bier: [0, 0, 0.00012, 0.00011],
  wein: [0, 0, 0, 0.00009],
  wollgewaender: [0.00027, 0.0002, 0.00016, 0.00014],
  leinen: [0, 0.00015, 0.00012, 0.0001],
  leder: [0, 0, 0.00004, 0.00003],
  pelz: [0, 0, 0.00004, 0.00003],
  brokat: [0, 0, 0, 0.00002],
  buecher: [0, 0, 0.00012, 0.00011],
  kerzenleuchter: [0, 0, 0, 0.00008],
  brillen: [0, 0, 0, 0.00003],
};

/** Production time in seconds per good. */
export const PROD_TIME: Record<string, number> = {
  holz: 105, stein: 180, eisenerz: 210, kohle: 210, eisen: 315, werkzeug: 420, pottasche: 840,
  quarz: 1260, glas: 1260, fisch: 110, weizen: 440, mehl: 220, brot: 220, vieh: 840, fleisch: 630,
  milch: 235, aepfel: 380, most: 190, kraeuter: 660, bier: 330, trauben: 2205, faesser: 945,
  wein: 1260, wolle: 200, wollgewaender: 200, hanf: 630, leinen: 210, tierhaeute: 840, sole: 140,
  salz: 210, leder: 420, pelze: 600, pelz: 600, golderz: 1260, gold: 1050, brokat: 3150, papier: 210,
  buecher: 630, bienenwachs: 840, kerzen: 1260, kerzenleuchter: 840, kupfererz: 280, messing: 420,
  brillen: 1260,
};

/** Direct inputs per good (1:1). Goods without an entry are raw. */
export const INPUTS: Record<string, string[]> = {
  brot: ['mehl'], mehl: ['weizen'],
  fleisch: ['vieh', 'salz'], salz: ['sole', 'kohle'], kohle: ['holz'],
  most: ['aepfel'],
  bier: ['kraeuter', 'weizen'],
  wein: ['trauben', 'faesser'], faesser: ['eisen', 'holz'], eisen: ['eisenerz', 'kohle'],
  wollgewaender: ['wolle'],
  leinen: ['hanf'],
  leder: ['tierhaeute', 'salz'],
  pelz: ['pelze'],
  brokat: ['gold'], gold: ['golderz', 'kohle'],
  buecher: ['papier'], papier: ['holz'],
  kerzenleuchter: ['kerzen', 'messing'], kerzen: ['bienenwachs', 'hanf'],
  messing: ['kupfererz', 'kohle'],
  brillen: ['quarz', 'messing'],
};

export interface Need {
  good: string;
  /** Number of buildings, rounded up. */
  count: number;
  /** Utilization per building in %, truncated to one decimal ("85" or "85.3"). */
  utilization: string;
}

/** Truncates (does not round) to one decimal and drops a trailing ".0", like the legacy app. */
export function formatUtilization(percent: number): string {
  return String(Math.floor(percent * 10) / 10);
}

export function demandPerTick(good: string, pop: Population): number {
  return RATES[good].reduce((sum, rate, i) => sum + rate * (pop[i] || 0), 0);
}

function addDemand(good: string, perTick: number, into: Map<string, number>): void {
  into.set(good, (into.get(good) ?? 0) + perTick);
  for (const input of INPUTS[good] ?? []) addDemand(input, perTick, into);
}

/** Residents of a tier that one building of the good supplies; 0 if the tier does not consume it. */
export function supply(good: string, tier: number): number {
  const rate = RATES[good][tier];
  return rate ? Math.floor(TICK_SECONDS / PROD_TIME[good] / rate) : 0;
}

export function need(good: string, perTickDemand: number): Need {
  const perBuilding = TICK_SECONDS / PROD_TIME[good];
  const count = Math.ceil(perTickDemand / perBuilding);
  return { good, count, utilization: formatUtilization(((perTickDemand / perBuilding) * 100) / count) };
}

/** Buildings needed for one final good, including its whole chain (demands per good are summed). */
export function chain(good: string, pop: Population): Need[] {
  const demand = new Map<string, number>();
  const perTick = demandPerTick(good, pop);
  if (perTick > 0) addDemand(good, perTick, demand);
  return [...demand].map(([g, d]) => need(g, d));
}

/** Final goods that at least one tier of the given population consumes. */
export function calculate(pop: Population): Need[] {
  return Object.keys(RATES)
    .filter((g) => demandPerTick(g, pop) > 0)
    .map((g) => need(g, demandPerTick(g, pop)));
}
