import { Injectable, Pipe, PipeTransform, inject, signal } from '@angular/core';

export const LANGS = ['en', 'de', 'es', 'fr'] as const;
export type Lang = (typeof LANGS)[number];

/** Translates English texts via dictionaries keyed by the English text; falls back to English. */
@Injectable({ providedIn: 'root' })
export class I18n {
  readonly lang = signal<Lang>(this.initial());
  private readonly dict = signal<Record<string, string>>({});

  constructor() {
    this.load(this.lang());
  }

  set(lang: Lang): void {
    this.lang.set(lang);
    localStorage.setItem('lang', lang);
    this.load(lang);
  }

  t(text: string): string {
    return this.dict()[text] ?? text;
  }

  private initial(): Lang {
    const l = (localStorage.getItem('lang') ?? navigator.language.slice(0, 2)) as Lang;
    return LANGS.includes(l) ? l : 'en';
  }

  private load(lang: Lang): void {
    if (lang === 'en') return this.dict.set({});
    fetch(`i18n/${lang}.json`).then(r => r.json()).then(d => this.dict.set(d));
  }
}

@Pipe({ name: 'tr', pure: false })
export class TrPipe implements PipeTransform {
  private readonly i18n = inject(I18n);
  transform(text: string): string {
    return this.i18n.t(text);
  }
}
