import { describe, expect, it } from 'vitest';
import { I18n } from './i18n';

describe('I18n', () => {
  it('falls back to English and translates after loading', async () => {
    const i18n = new I18n();
    expect(i18n.t('Wood')).toBe('Wood');
    globalThis.fetch = (() => Promise.resolve({ json: () => Promise.resolve({ Wood: 'Holz' }) })) as unknown as typeof fetch;
    i18n.set('de');
    await new Promise((r) => setTimeout(r));
    expect(i18n.t('Wood')).toBe('Holz');
    expect(i18n.t('Unknown')).toBe('Unknown');
  });
});
