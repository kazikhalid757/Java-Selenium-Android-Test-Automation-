package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks {
    private Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @After
    public void tearDown(Scenario scenario) throws MalformedURLException {
        if (scenario.isFailed()) {
            // Capture and save screenshot
//            byte[] screenshot = ((TakesScreenshot) base.AppiumDriverManager()).getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot) base.AppiumDriverManager()).getScreenshotAs(OutputType.BYTES);
            saveScreenshot(screenshot, scenario.getName());
        }

    }

    private void saveScreenshot(byte[] screenshot, String fileName) {
        File screenshotDirectory = new File("screenshots");
        if (!screenshotDirectory.exists()) {
            screenshotDirectory.mkdir();
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("screenshots/" + fileName + ".png");
            outputStream.write(screenshot);
            outputStream.close();
            System.out.println("Screenshot saved: screenshots/" + fileName + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
