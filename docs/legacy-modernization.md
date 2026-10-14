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

1. **Stack**: Ionic + Angular + Capacitor for everything, including the native Java apps (user decision).
2. **woistwas**: the three variants merge into one app `apps/woistwas/` with all three in `legacy/{android,ionic3,capacitor}/`; `modernized/` continues the Capacitor line (latest app id `de.iusemybrain.woistwas`).
3. **Secrets**: `woistwas-master` contains a keystore, `Android-Keyring` and `build.json`. They are not moved into `apps/`; keep them local in root `legacy/`.

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
| myannoonline | no | no | |

## Log

- 2026-10-14: Repo set up like the Java repo (AGENTS.md, README, .gitignore, this plan). Inventory of the 5 entries in `legacy/`. Nothing moved or modified.
- 2026-10-14: `star-wars-films` modernized (Angular 22, Ionic 9, Capacitor 8). Three list pages collapsed into one generic page, `@ionic/storage` replaced by `@capacitor/preferences`, EmailComposer replaced by a `mailto:` link, unfavorite bug fixed (`splice(-1)` removed the last entry when the film was not a favorite). No Android SDK here: `npx cap add android` and `cap sync` ran, but no APK was built or run on a device.
- 2026-10-14: `woistwas` modernized (Angular 22, Ionic 9, Capacitor 8). Three variants moved to `apps/woistwas/legacy/{android,ionic3,capacitor}` (keystore, `Android-Keyring`, `build.json` left in root `legacy/woistwas-master`). `cities.ts` converted to `public/cities.json`, search/distance logic to tested pure functions, tap-to-copy restored via `@capacitor/clipboard`. Fixed: results capped before distance sort, failed GPS searched at 0/0, empty search listed cities. Location permissions added to the manifest. No APK built (no Android SDK).
