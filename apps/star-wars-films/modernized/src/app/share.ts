import { Film } from './models';

export const SHARE_RECIPIENT = 'markus.allwang@tuta.io';

export function shareMailto(film: Film): string {
  const subject = `I love this one: ${film.title}`;
  const body = `Can you remember the opening?\n\n"${film.opening_crawl}"`;
  return `mailto:${SHARE_RECIPIENT}?subject=${encodeURIComponent(subject)}&body=${encodeURIComponent(body)}`;
}
