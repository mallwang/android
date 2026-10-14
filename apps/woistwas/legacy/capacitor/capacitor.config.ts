import {CapacitorConfig} from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'de.iusemybrain.woistwas',
  appName: 'woistwas-capacitor',
  webDir: 'www',
  plugins: {
    SplashScreen: {
      launchShowDuration: 0
    }
  }
};

export default config;
