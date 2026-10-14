export interface Monument {
  id: string;
  bev: 'none' | 'pioneers' | 'settlers' | 'merchants' | 'nobles';
  residents: number;
  upkeep: number;
  radius: number;
  size: string;
  knowledge: number;
  /** Construction time in days. */
  duration: number;
  parts: number;
  residentsPlus: number;
  goods: [good: string, amount: number][];
}

export const MONUMENT_NAMES: Record<string, string> = {
  bibliothek: 'Library', kaiserdom: 'Imperial Cathedral', amphitheater: 'Amphitheater', festung: 'Fortress',
  apfelgarten: 'Apple Garden', weizengarten: 'Wheat Garden', hanfgarten: 'Hemp Garden',
  kraeutergarten: 'Herb Garden', traubengarten: 'Grape Garden', bienenwachsgarten: 'Beeswax Garden',
};

export const PHASE_NAMES: Record<string, string> = {
  gesamt: 'Total', phase1: 'Phase 1', phase2: 'Phase 2', phase3: 'Phase 3',
};

/** Groups the flat list by monument, keeping the file order (total first, then phases). */
export function groupMonuments(all: Monument[]): { name: string; parts: { phase: string; monument: Monument }[] }[] {
  const groups = new Map<string, { phase: string; monument: Monument }[]>();
  for (const monument of all) {
    const [key, phase] = monument.id.split('_');
    groups.set(key, [...(groups.get(key) ?? []), { phase: PHASE_NAMES[phase], monument }]);
  }
  return [...groups].map(([key, parts]) => ({ name: MONUMENT_NAMES[key], parts }));
}
