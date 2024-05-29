package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pages.LocatorPage.Second;
import utils.ContextSetup;



public class SecoundSteps {
    AppiumDriver driver;
    Second second;
    ContextSetup setup;
    private static final Logger logger = (Logger) LogManager.getLogger(SecoundSteps.class);

    public SecoundSteps(ContextSetup setup){
        this.setup = setup;
        this.second = setup.pageObjectManager.getSecondPage();
    }


    @Then("Check that Arc Menu option show properly")
    public void checkThatArcMenuOptionShowProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.Arc_option().isDisplayed());
    }

    @When("Click that Arc Menu option")
    public void clickThatArcMenuOption() {
        second.Arc_option().click();
    }

    @Then("Check that Arc Menu button show properly")
    public void checkThatArcMenuButtonShowProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.Arc_menu_button().isDisplayed());
    }

    @When("Click that Arc Menu button")
    public void clickThatArcMenuButton() {
        second.Arc_menu_button().click();
    }

    @And("Click that Android icon button")
    public void clickThatAndroidIconButton() throws InterruptedException {
        Thread.sleep(2000);
        second.Arc_menu_options().click();
    }

    @Then("Check that Android icon button work properly")
    public void checkThatAndroidIconButtonWorkProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.Arc_menu_options_menu().isDisplayed());
    }



    @Then("Check that Chart option show properly")
    public void checkThatChartOptionShow__Properly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.Chart_option().isDisplayed());
    }
    @When("Click that Chart option")
    public void clickThatChartOption() {
        second.Chart_option().click();
    }

    @Then("Check that Bar Chat and Pie Chart button show properly")
    public void checkThatBarChatAndPieChartButtonShowProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.BarChart().isDisplayed());
        Assert.assertTrue(second.PieChart().isDisplayed());
    }

    @When("Click that Bar Chart button")
    public void clickThatBarChartButton() {
        second.BarChart().click();
    }

    @Then("Check that Bar Chart page load properly")
    public void checkThatBarChartPageLoadProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.BarChart_page().isDisplayed());
    }

    @When("Go to Chart page")
    public void goToChartPage() throws InterruptedException {
        Thread.sleep(1000);
        second.previous_page();
        Thread.sleep(1000);
        second.previous_page();

    }
    @And("Click that Pie Chart button")
    public void clickThatPieChartButton() {
        second.PieChart().click();
    }

    @And("Check that Pie Chart page load properly")
    public void checkThatPieChartPageLoadProperly() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(second.PieChart_page().isDisplayed());
        logger.info("End SecondSteps feature ");
    }

}

