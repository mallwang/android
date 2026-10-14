# myAnnoOnline

Calculators for the game Anno Online. Enter the number of Pioneers, Settlers, Merchants and Nobles; the app lists every consumed good with the number of production buildings and their utilization. Tap a good to see the whole production chain (for example Salt Works, Salt Mines, Charcoal Burners and Lumberjacks for meat). Inputs are saved on the device. UI text is English, German, Spanish or French (selectable on the About page). Ionic + Angular + Capacitor; runs in the browser and as an Android app (`com.iusemybrain.apps.myannoonline`).

## How to run the application

```bash
npm ci
npm start    # http://localhost:4200
```

## Development Guide

### Requirements

- Node.js 22+ and npm
- Android Studio / Android SDK (only for the Android app)

### Build, test, package

```bash
npm test                                       # Vitest unit tests
npm run build                                  # web build to dist/myannoonline/browser
npx cap sync android && npx cap open android   # build the APK in Android Studio
```

The Android project was generated and synced, but no APK has been built or run here (no Android SDK available).

### Project layout

| Path | Content |
|------|---------|
| `src/app/consumption.ts` | Pure logic: consumption rates, production times, chain trees, building count/utilization (unit-tested) |
| `src/app/pages/consumption.page.ts` | Input fields, result list with chain details, persistence via `@capacitor/preferences` |
| `src/app/monuments.ts`, `public/monuments.json` | Monument data (generated from the legacy Java, 33 entries) and grouping by monument/phase (unit-tested) |
| `src/app/goods.ts` | English good names and producing buildings |
| `src/app/buildings.ts`, `public/buildings.json` | Building data (generated from the legacy Java, 131 entries), category/producer lookups (unit-tested) |
| `src/app/pages/{supply,chains,buildings,monuments,tabs}.page.ts` | Supply table, production chains, buildings, monuments, tab navigation |
| `src/app/islands.ts`, `public/islands.json`, `public/islands/` | Island data (30 islands, legacy images), size filter and fertility labels (unit-tested) |
| `src/app/changelog.ts`, `src/app/pages/{islands,about}.page.ts` | Changelog data, islands and About pages |
| `src/app/i18n.ts`, `public/i18n/{de,es,fr}.json` | `I18n` service and `tr` pipe; dictionaries keyed by the English text (from the legacy `strings.xml` plus a few hand-written entries), English fallback |
| `android/` | Capacitor Android project |

## Changes compared to the legacy version

`../legacy/` is the original native Java app (v1.3).

- Native Android (Java, fragments) → Ionic 9 / Angular 22 / Capacitor 8 (standalone components, signals).
- ~1200 lines of per-good getters plus ~1600 lines of chain code in the UI → one table-driven module with chain trees.
- Utilization is still truncated (not rounded) to one decimal, now with `Math.floor` instead of string slicing.
- Fixed: in the wine chain the Lumberjack count used the coal production time instead of the wood time.
- The consumption table is derived (`supply()`) from the rates and production times instead of 34 stored values.
- Island builder replaced by an islands browser (size filter, legacy island and deposit images, fertility as text). Legacy bugs not copied: missing Wheat+Herbs image, wrong deposit image of island 16.
- Impressum and changelog ported as an About page; the legacy launcher icon is kept.
- Translations: a signal-based lookup instead of Android resource folders. Monument names, some building names and composed sentences ("Needs 5 residents") are still English-only where the legacy app had no translation.
- The rule "a tier consumes a good iff its rate is non-zero" was checked against the legacy constants (34 non-zero rates, one test); spices are never calculated in the legacy app either.
- Building data moved from ~3000 lines of Java constructors to `buildings.json`. Fixed: Kontor Lvl1 no longer reads another building's resource costs.
