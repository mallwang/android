# Android projects

Collection of Android apps, modernized from legacy code to Ionic + Angular + Capacitor.

## Prerequisites

- Node.js 22+ and npm
- For Android builds: Android SDK / Android Studio (optional, only for APKs)

```bash
cd apps/<app>/modernized
npm ci
npm start          # dev server in the browser
npm test
```

## Repository layout

| Path | Content |
|------|---------|
| `apps/<app>/legacy/` | Original sources (read-only) |
| `apps/<app>/modernized/` | Modernized project with its own README |
| `legacy/` | Apps not yet modernized (git-ignored, local only) |
| [docs/](docs/legacy-modernization.md) | Migration plan and status log |
| [AGENTS.md](AGENTS.md) | Context for coding agents |

## Applications

| App | Description |
|-----|-------------|
| [star-wars-films](apps/star-wars-films/modernized/README.md) | SWAPI browser: films, people, planets, favorites |

Plan and status of the remaining apps: [docs](docs/legacy-modernization.md).
