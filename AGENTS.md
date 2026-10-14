# AGENTS.md

Android app collection: legacy apps being modernized to **Ionic + Angular + Capacitor** (current versions). Read the READMEs for details.

## Layout

- `apps/<app>/legacy/` – original sources, moved unchanged. Treat as read-only reference.
- `apps/<app>/modernized/` – Ionic/Angular/Capacitor project with README.
- `legacy/` (repo root) – apps not yet modernized. **Git-ignored; never commit.** When one is modernized, move it to `apps/<app>/{legacy,modernized}`.
- `docs/legacy-modernization.md` – plan, status table and log.

## Conventions

- Modernized apps: current Angular (standalone components, signals), Ionic, Capacitor; TypeScript `strict`; package manager npm; app id unchanged (`de.iusemybrain.*`) so Play Store updates stay possible.
- Pure logic (calculations, parsing, filtering) lives in plain TS services/functions, separate from components, and is unit-tested.
- Native device access only via Capacitor plugins (no Cordova plugins, no `@ionic-native`).
- Every modernized app has an English README: description, "How to run the application", "Development Guide" (Requirements, Build/test/package, Project layout, Changes compared to the legacy version).
- Update `docs/legacy-modernization.md` (table + log) and the root README when adding an app.

## Commands

- Per app, in `modernized/`: `npm ci`, `npm start`, `npm test`, `npm run build`.
- Android: `npx cap sync android`; building the APK needs the Android SDK (not installed by default; say so in the log if not built).

## Commits

- [Conventional Commits](https://www.conventionalcommits.org/): `type(scope): summary`, imperative, max ~72 chars. Types: `feat`, `fix`, `refactor`, `test`, `docs`, `build`, `chore`.
- Scope = app directory name (e.g. `feat(woistwas): ...`); omit for repo-wide changes.
- One logical change per commit (one commit per app migration, docs separate from code).

## Do not

- Do not commit unless asked. Do not edit files under `legacy/`.
- Never commit keystores, keyrings or passwords (`legacy/woistwas-master/*.keystore`, `Android-Keyring`, `build.json`). Leave them out when moving an app.
