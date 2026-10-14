import { describe, expect, it } from 'vitest';
import { Film } from './models';
import { shareMailto } from './share';

describe('shareMailto', () => {
  it('encodes subject and opening crawl', () => {
    const film = { title: 'A New Hope', opening_crawl: 'It is a period\nof civil war.' } as Film;
    const url = new URL(shareMailto(film));
    expect(url.protocol).toBe('mailto:');
    expect(url.searchParams.get('subject')).toBe('I love this one: A New Hope');
    expect(url.searchParams.get('body')).toContain('"It is a period\nof civil war."');
  });
});
