package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import pages.LocatorPage.First;
import utils.ContextSetup;



public class FirstSteps {

    AppiumDriver driver;
    First first;
    ContextSetup setup;
    private static final Logger logger = (Logger) LogManager.getLogger(FirstSteps.class);

    public FirstSteps(ContextSetup setup){
       this.setup = setup;
       this.first = setup.pageObjectManager.getFirstPage();
    }



    @Given("Open Application")
    public void openApplication() throws InterruptedException {
        first.waits_1s();
        first.permission_1().click();
        first.waits_1s();
        first.permission_2().click();
        logger.info("Open Application successfully");

    }

    @Then("Check that Splash screen show properly")
    public void checkThatSplashScreenShowProperly() throws InterruptedException {
        first.waits_1s();
        Assert.assertTrue(first.Splash().isDisplayed());


    }

    @And("Ckeck that Android UI Design page show properly")
    public void ckeckThatAndroidUIDesignPageShowProperly() throws InterruptedException {
        first.waits_4s();
        Assert.assertTrue(first.welcome_text().isDisplayed());


    }

    @And("Check that Welcome text visible properly")
    public void checkThatWelcomeTextVisibleProperly() {
        Assert.assertTrue(first.welcome_text().isDisplayed());

    }

    @And("Check that Android icon show properly")
    public void checkThatAndroidIconShowProperly() {
        Assert.assertTrue(first.andriod_icon().isDisplayed());
    }

    @And("Check that Menu bar button show properly")
    public void checkThatMenuBarButtonShowProperly() throws InterruptedException {
        first.waits_5s();
        Assert.assertTrue(first.menu_bar().isDisplayed());
    }

    @And("Check that OPTIONS button show properly")
    public void checkThatOPTIONSButtonShowProperly() {
        Assert.assertTrue(first.option_button().isDisplayed());
    }

    @When("Click that Menu bar button")
    public void clickThatMenuBarButton() {
        first.menu_bar().click();
    }

    @Then("Check that Animations option show properly")
    public void checkThatAnimationsOptionShowProperly() throws InterruptedException {
        first.waits_1s();
        Assert.assertTrue(first.Animations_option().isDisplayed());

    }

    @When("Click that Animations option")
    public void clickThatAnimationsOption() {
        first.Animations_option().click();
    }

    @Then("Check that Alpha button show properly")
    public void checkThatAlphaButtonShowProperly() throws InterruptedException {
        first.waits_1s();
        Assert.assertTrue(first.Alpha_button().isDisplayed());
    }

    @When("Click that Alpha button")
    public void clickThatAlphaButton() {
        first.Alpha_button().click();
    }

    @Then("Check that Normal button show properly")
    public void checkThatNormalButtonShowProperly() throws InterruptedException {
        first.waits_2s();
        Assert.assertTrue(first.Normal_button().isDisplayed());
    }


    @And("Check that Alpha zero point five f button show properly")
    public void checkThatAlphaZeroPointFiveFButtonShowProperly() {
//        Assert.assertTrue(first.Alpha05f_button().isDisplayed());
        first.Alpha_button().click();
        logger.info("End FirstSteps featuRe file");
    }


}
