export interface Release {
  version: string;
  date: string;
  changes: string[];
}

/** Newest first. Versions up to 1.3 are from the legacy changelog. */
export const CHANGELOG: Release[] = [
  { version: '2.0.0', date: '2026-10-14', changes: ['Rebuilt with Ionic, Angular and Capacitor', 'Production chains, buildings and supply table pages'] },
  { version: '1.3', date: '2015-05-10', changes: ['Calculation error in summary view fixed', 'Monuments available'] },
  { version: '1.2', date: '2015-05-07', changes: ['Consumption calculator displays details', 'Islands available', 'Consumption table available'] },
  { version: '1.1', date: '2015-04-28', changes: ['Bugfixing of minor errors'] },
  { version: '1.0', date: '2015-04-17', changes: ['First release, have fun!'] },
];
