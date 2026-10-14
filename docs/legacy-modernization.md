# Plan: Modernize the apps in `legacy/`

Same approach as the [Java repo](https://github.com/mallwang/java): legacy sources move unchanged to
`apps/<app>/legacy/`, a new project in `apps/<app>/modernized/`, one commit per app, status table + log here.
Target stack (decision 2026-10-14): **Ionic + Angular + Capacitor, current versions**, for all apps.

## Inventory

| Entry | Type | Size | Plan |
|-------|------|-----:|------|
| `star-wars-films-master` | Ionic 5 / Angular 10 / Cordova, SWAPI demo (films, people, planets, favorites) | ~770 TS LOC | Pilot. Same stack, version jump only. Own app `star-wars-films`. |
| `woistwas-capacitor-master` | Ionic 5 / Angular 10 / Capacitor 5, v1.9 (search, GPS nearby, list of cities) | ~17k TS LOC (mostly `cities.ts` data) | Base for the merged app `woistwas`. |
| `woistwas-master` | Ionic 3 / Angular 5 / Cordova, v1.5 | ~17k TS LOC | Older generation, reference only; `legacy/` of `woistwas`. |
| `woistwas-android-master` | Native Android (Java, SQLite + XML), v1.1 | ~1.3k Java LOC | Oldest generation, reference only; `legacy/` of `woistwas`. |
| `myannoonline-master` | Native Android (Java, fragments), v1.3, Anno calculators | ~14k Java LOC | Port to Ionic. Largest. Calculation logic (`Verbrauchsrechner`, `Monumentersteller`) to pure TS first. |

## Decisions

1. ~~DONE~~ **Stack**: Ionic + Angular + Capacitor for everything, including the native Java apps (user decision).
2. ~~DONE~~ **woistwas**: the three variants merge into one app `apps/woistwas/` with all three in `legacy/{android,ionic3,capacitor}/`; `modernized/` continues the Capacitor line (latest app id `de.iusemybrain.woistwas`).
3. ~~DONE~~ **Secrets**: `woistwas-master` contains a keystore, `Android-Keyring` and `build.json`. They are not moved into `apps/`; keep them local in root `legacy/`.

## Target layout

```
apps/
  star-wars-films/{legacy,modernized}
  woistwas/{legacy/{android,ionic3,capacitor},modernized}
  myannoonline/{legacy,modernized}
```

## Workflow per app

1. Move from `legacy/` to `apps/<app>/legacy/` (without `node_modules`, `build/`, `.idea`, secrets).
2. Check what the legacy app does (screens, data, device features); write down gaps/bugs found.
3. Create `modernized/` with the current Ionic CLI (`ionic start`, Angular standalone, Capacitor), same app id/name.
4. Port: logic to plain TS + unit tests; data (e.g. cities, tables) to JSON/TS data files; Cordova/`@ionic-native` to Capacitor plugins.
5. English README with the structure from AGENTS.md.
6. `npm ci && npm test && npm run build`; `npx cap sync android` (APK only if an Android SDK is available).
7. Update status table + log, root README.
8. One commit per app (`feat(<app>): ...`), docs in a separate commit.

## Order

1. `star-wars-films` (pilot, smallest, same stack)
2. `woistwas` (merge 3 variants, port capacitor line)
3. `myannoonline` (largest; start with the logic classes + tests)

## Status

| App | Moved | Modernized | Notes |
|-----|:---:|:---:|-------|
| star-wars-films | yes | yes | Web build + 5 unit tests green; Android project added and synced, APK not built (no Android SDK). |
| woistwas | yes | yes | Web build + 6 unit tests green; Android project added and synced, APK not built (no Android SDK). |
| myannoonline | yes | yes | All screens ported incl. islands, About/changelog and de/es/fr (14 unit tests green). Android project added and synced, APK not built (no Android SDK). |

## Open tasks: myannoonline

Each task is independent, so it can run in its own session. Legacy sources: `apps/myannoonline/legacy/app/src/main/java/com/iusemybrain/apps/myannoonline/` (Latin-1: read via `iconv -f latin1 -t utf8`); strings in `legacy/app/src/main/res/values{,-de,-es,-fr}/strings.xml`. Work in `apps/myannoonline/modernized/`. Generate data with scripts kept outside the repo (`python3 -I`). Do not replicate legacy bugs. Shared helpers: `src/app/goods.ts` (good ids, names, buildings), `src/app/consumption.ts`, `src/app/monuments.ts` (pattern for JSON data plus grouping). After each task: `npm test -- --watch=false`, `npm run build`, `npx cap sync android`; update the app README, the status table/log here and the root README.

1. **Consumption table**: port `FragVerbrauchstabelle` (307 lines) plus the supply table of residents per building (fisch 649/909/1090/1239; brot 545/681/757; fleisch 280; milch 255/354/425/490; most 717/877/986; bier 757/826; wein 264; woll 555/750/937/1071; leinen 952/1190/1428; leder 1785/2380; pelz 1250/1666; brokat 476; buecher 396/432; kerzenleuchter 446; brillen 793). Reuse `RATES` from `consumption.ts` if it matches; add a page and tab.
2. **Production chains page**: port `FragProduktionsketten` (726 lines). Chain data already exists as `INPUTS` in `consumption.ts`; only the page and tab are missing.
3. **Buildings and production costs**: port `Gebaeudeersteller` (3068 lines), `FragGebaeude` (1007), `FragProduktionskosten` (474) by generating JSON with a script. Known legacy bugs: `erstelleKontorLvl1` uses the wrong resources. Add a data test (goods ids all exist in `GOODS`).
4. ~~DONE~~ **Island builder**: port `Inselersteller` (469 lines) and the islands fragment. Pure logic to tested TS, data to JSON.
5. ~~DONE~~ **Impressum and changelog**: port `FragImpressum` and `ChangeLog.java` (300 lines) as a page with static content.
6. ~~DONE~~ **Translations (de/es/fr)**: only English exists. Needs an i18n approach (e.g. a small signal-based lookup or Angular i18n) decided first. Largest task, do it last, after the pages are stable. Monument names have no English strings in the legacy app (German only; the English map in `monuments.ts` is mine).
7. ~~DONE~~ **Icon and drawables**: app icon from `legacy/.../resources/icon`, then `@capacitor/assets` for the Android icon/splash.
8. ~~DONE~~ **Verify the consumption rule**: a tier consumes a good iff its rate is non-zero. This is inferred from the "-" entries and is unchecked against the legacy unlock thresholds. Compare with `FragVerbrauch`/`Verbrauchsrechner` and add a test.
9. ~~DONE~~ **Final**: set the status table entry to `yes`, remove "partial port" from the app README, build the APK if an Android SDK is available (not installed by default), and commit (`feat(myannoonline): ...` plus a separate `docs: ...` commit). Nothing is committed yet.

## Log

- 2026-10-14: Repo set up like the Java repo (AGENTS.md, README, .gitignore, this plan). Inventory of the 5 entries in `legacy/`. Nothing moved or modified.
- 2026-10-14: `star-wars-films` modernized (Angular 22, Ionic 9, Capacitor 8). Three list pages collapsed into one generic page, `@ionic/storage` replaced by `@capacitor/preferences`, EmailComposer replaced by a `mailto:` link, unfavorite bug fixed (`splice(-1)` removed the last entry when the film was not a favorite). No Android SDK here: `npx cap add android` and `cap sync` ran, but no APK was built or run on a device.
- 2026-10-14: `woistwas` modernized (Angular 22, Ionic 9, Capacitor 8). Three variants moved to `apps/woistwas/legacy/{android,ionic3,capacitor}` (keystore, `Android-Keyring`, `build.json` left in root `legacy/woistwas-master`). `cities.ts` converted to `public/cities.json`, search/distance logic to tested pure functions, tap-to-copy restored via `@capacitor/clipboard`. Fixed: results capped before distance sort, failed GPS searched at 0/0, empty search listed cities. Location permissions added to the manifest. No APK built (no Android SDK).
- 2026-10-14: `myannoonline` modernized (Angular 22, Ionic 9, Capacitor 8). Sources moved to `apps/myannoonline/legacy`. `Verbrauchsrechner` and the chain code of `FragVerbrauch` replaced by the table-driven, tested `consumption.ts` plus one page with persisted inputs. Fixed: wine-chain Lumberjack count used the coal time. `Monumentersteller` data converted to `monuments.json` with a monuments page and tabs. Supply table derived from rates and production times; `Gebaeudeersteller` data (131 buildings) generated to `buildings.json` with Chains and Buildings pages (Kontor Lvl1 resource bug not copied). Islands browser, About page with changelog, de/es/fr via an `I18n` service and `tr` pipe, legacy launcher icon, consumption rule verified (34 rates). Some names/sentences stay English. App id kept as `com.iusemybrain.apps.myannoonline`. No APK built (no Android SDK).
