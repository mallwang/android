# Star Wars Films

Browse films, people and planets from [SWAPI](https://swapi.dev), read the opening crawl, mark favorites and share a film by email. Ionic + Angular + Capacitor; runs in the browser and as an Android app.

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
npm test                                   # Vitest unit tests
npm run build                              # web build to dist/star-wars-films/browser
npx cap sync android && npx cap open android   # build the APK in Android Studio
```

The Android project was generated and synced, but no APK has been built or run here (no Android SDK available).

### Final check and APK build on Windows

Not done in the development environment (WSL2, no Android SDK). Run these steps once on a Windows machine with Android Studio.

1. Install Node.js 22+, JDK 21 and Android Studio (SDK Platform 36, Build-Tools and Platform-Tools via the SDK Manager). Set `ANDROID_HOME` (default `%LOCALAPPDATA%\Android\Sdk`).
2. Check the web part in PowerShell:
   ```powershell
   npm ci
   npm test
   npm run build
   ```
3. Sync the web build into the Android project and open it:
   ```powershell
   npx cap sync android
   npx cap open android
   ```
4. In Android Studio wait for the Gradle sync, then run the app on an emulator or a phone with USB debugging. Check:
   - the three tabs load films, people and planets (internet required)
   - a film opens its details; the star toggles the favorite and it survives an app restart
   - the share button opens the mail app with subject "I love this one: <title>"
   - the status bar colour and the splash screen look right
5. Debug APK from the command line (result: `android\app\build\outputs\apk\debug\app-debug.apk`):
   ```powershell
   cd android
   .\gradlew.bat assembleDebug
   ```
6. Release build: Build > Generate Signed App Bundle / APK. Use the existing Play Store keystore so the app id `de.iusemybrain.starwars` stays updatable. Never commit keystores or passwords.
7. Note the outcome (built, tested on which device) in the log of `docs/legacy-modernization.md`.

### Project layout

| Path | Content |
|------|---------|
| `src/app/pages/` | Tabs, generic list page (films/people/planets), film details |
| `src/app/services/` | `ApiService` (SWAPI), `FavoriteService` (Capacitor Preferences) |
| `src/app/share.ts` | `mailto:` link for sharing |
| `resources/` | Icon and splash source images |
| `android/` | Capacitor Android project |

## Changes compared to the legacy version

- Ionic 5 / Angular 10 / Cordova → Ionic 9 / Angular 22 / Capacitor 8 (standalone components, signals, zoneless).
- Three near-identical list pages replaced by one generic page.
- `@ionic/storage` → `@capacitor/preferences`; Cordova EmailComposer → `mailto:` link.
- Fixed: unfavoriting a film that was not a favorite removed the last favorite.
- Added: error message when SWAPI cannot be reached, unit tests.
