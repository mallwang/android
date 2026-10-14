# **Wo ist was?!** Android application

This repository contains the sourcecode of the **Wo ist was?!** Android application using [Capacitor](https://capacitorjs.com/).

## Functionality

The repository contains the following functionality:

- using Angular and Ionic for the base application
- using Capcitor for creating native applications (currently only Angular)
- a CICD pipeline is setup with different stages
- using Git Hooks for format the source code using Prettier and check the commit message using Commitlint

## Setup

#### Clone repository

```bash
git clone git@gitlab.com:markus.allwang/woistwas-capacitor.git
cd woistwas-capacitor
```

#### Install dependencies

```bash
npm install
```

## Development

The sourcecode of the base application (Anguar and Ionic) is located in the `src` folder. Any changes regarding the different components, its logic and styling must be done here.

The sourcecode of the Angular application is located in the `android` folder. It was initially created using Capacitor (`npx cap sync`) and must normally not be touched. Once the base application changes, only the generated assets (in the **www** folder) must be copied to the Android application (`npx cap copy`).

#### Start the Angular application

By running `npm run start` the Angular base application will be served on http://localhost:4200.

#### Start the Android application

Before starting the Android application, the assets of the Angular base application must be built (via `npm run build:dev` or `npm run build:prod`) and afterwards copied to the Android application using Capacitor via `npx cap copy`. Now you can open the `android` folder in Android Studio and run the Application on a virtual or real device.

## Release

**TODO:** describe the automatic release process which generates a Changelog.md file and a release in GitLab with all required artifacts.

For creating a release which contains the native Android application, the required version code and version name must be incremented. This is also a prerequisite for the Play Store to release a new version of the application.

The following files need to be updated:

- package.json (`version`)
- package-lock.json (`version`)
- .gitlab-ci.yml (`VERSION` and `VERSION_CODE`)
- android/app/build.gradle (`versionCode` and `versionName`)
