package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pages.LocatorPage.First;
import pages.LocatorPage.Third;
import utils.ContextSetup;


public class ThirdSteps {

    AppiumDriver driver;
    Third third;
    First first;
    ContextSetup setup;
    private static final Logger logger = (Logger) LogManager.getLogger(ThirdSteps.class);


    public ThirdSteps(ContextSetup setup){
        this.setup = setup;
        this.third = setup.pageObjectManager.getThirdPage();
    }

    @Then("Check that Drag & Drop option show properly")
    public void checkThatDragDropOptionShowProperly__() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(third.DragDrop_option().isDisplayed());
    }

    @When("Click that Drag & Drop option")
    public void clickThatDragDropOption() throws InterruptedException {
        Thread.sleep(1000);
        third.DragDrop_option().click();
    }

    @Then("Check that DragDrop and Simple DragDrop button show properly")
    public void checkThatDragDropAndSimpleDragDropButtonShowProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(third.DragDrop_button().isDisplayed());
        Assert.assertTrue(third.Simple_DragDrop_button().isDisplayed());
    }

    @When("Click that DragDrop button")
    public void clickThatDragDropButton() {
        third.DragDrop_button().click();
    }

    @Then("Check that DragDrop page load properly")
    public void checkThatDragDropPageLoadProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(third.DragDrop_page().isDisplayed());
    }

    @When("Go to Drag & Drop page")
    public void goToDragDropPage() throws InterruptedException {
        Thread.sleep(1000);
        third.previous_page();

    }

    @And("Click that Simple DragDrop button")
    public void clickThatSimpleDragDropButton() throws InterruptedException {
        Thread.sleep(1000);
        third.Simple_DragDrop_button().click();
    }

    @Then("Check that Simple DragDrop page load properly")
    public void checkThatSimpleDragDropPageLoadProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(third.Simple_DragDrop_page().isDisplayed());
    }

    @When("Click that OPTIONS button")
    public void clickThatOPTIONSButton() throws InterruptedException {
        Thread.sleep(1000);
        first.option_button().click();
    }

    @Then("Ckeck that Exit option visible properly")
    public void ckeckThatExitOptionVisibleProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(third.exit_button().isDisplayed());
    }

    @When("Click that Exit option")
    public void clickThatExitOption() {
        third.exit_button().click();
        logger.info("End ThirdSteps feature file");
    }

    @Then("Check that APPLICATION close properly")
    public void checkThatAPPLICATIONCloseProperly() throws InterruptedException {
        try {
            Thread.sleep(4000);
            Assert.assertFalse(first.andriod_icon().isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Application is closed properly.");
        }
    }



}
