import {enableProdMode} from "@angular/core";
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app.module';

// enable production mode of angular
enableProdMode();

platformBrowserDynamic().bootstrapModule(AppModule);
