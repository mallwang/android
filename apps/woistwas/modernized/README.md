# Wo ist was?!

Find the town behind a German zip code, or the towns near you. Search by name or zip code, GPS search within 20 km, a full alphabetical list of all places, tap an entry to copy "zip name". UI text is German. Ionic + Angular + Capacitor; runs in the browser and as an Android app (`de.iusemybrain.woistwas`).

## How to run

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
npm run build                                  # web build to dist/woistwas/browser
npx cap sync android && npx cap open android   # build the APK in Android Studio
```

The Android project was generated and synced, but no APK has been built or run here (no Android SDK available). On a machine with Android Studio (SDK Platform 36, JDK 21): `npx cap sync android`, run on a device, check search by name/zip, the GPS button (permission prompt), the full list and tap-to-copy. Release builds must use the existing Play Store keystore (never commit it).

### Project layout

| Path | Content |
|------|---------|
| `src/app/cities.ts` | Pure logic: search, haversine distance, nearby search (unit-tested) |
| `src/app/services/city.service.ts` | Loads `public/cities.json` once |
| `src/app/pages/` | Tabs, search page, full list, city row (copy to clipboard) |
| `public/cities.json` | 16,481 German places (zip, name, state, district, lat, lon) |
| `resources/` | Icon source image |
| `android/` | Capacitor Android project |

## Changes compared to the legacy version

`../legacy/` holds the three earlier generations: `android` (native Java, v1.1), `ionic3` (Ionic 3 / Cordova, v1.5) and `capacitor` (Ionic 5 / Capacitor 5, v1.9, the base of this port).

- Ionic 5 / Angular 10 / Capacitor 5 → Ionic 9 / Angular 22 / Capacitor 8 (standalone components, signals).
- `cities.ts` (1.2 MB in the bundle) → `public/cities.json` with named fields, loaded on demand.
- Search/distance logic moved out of the page into plain functions with tests.
- `@ionic-native` status bar/splash → Capacitor plugins; tap-to-copy (from the ionic3 version) restored with `@capacitor/clipboard`.
- Fixed: results were cut to the first 200 matches *before* sorting by distance (now nearest first); a failed GPS lookup still searched around 0/0; an empty search listed cities.
