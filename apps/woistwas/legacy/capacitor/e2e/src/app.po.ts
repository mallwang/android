import {browser, by, element} from 'protractor';

export class AppPage {
  public navigateTo(): any {
    return browser.get('/');
  }

  public getParagraphText(): any {
    return element(by.deepCss('app-root ion-content')).getText();
  }
}
