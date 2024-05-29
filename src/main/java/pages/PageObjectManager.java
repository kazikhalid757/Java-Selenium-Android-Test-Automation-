package pages;

import io.appium.java_client.AppiumDriver;
import pages.LocatorPage.Second;
import pages.LocatorPage.First;
import pages.LocatorPage.Third;

public class PageObjectManager {

    public static AppiumDriver driver;
    public First testingApp;
    public Second second;
    public Third third;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public First getFirstPage() {
        testingApp = new First(driver);
        return testingApp;
    }
    public Second getSecondPage() {
        second = new Second(driver);
        return second;
    }

    public Third getThirdPage() {
        third = new Third(driver);
        return third;
    }

}
