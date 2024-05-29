package pages.LocatorPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Third {

    public AppiumDriver driver;

    By DragDrop_option=By.xpath("//android.widget.ListView/android.widget.LinearLayout[5]");
    By DragDrop_button=By.id("com.boopathy.raja.tutorial:id/Drag_and_Drop");
    By Simple_DragDrop_button=By.id("com.boopathy.raja.tutorial:id/Drag_and_Drop_Simple");
    By DragDrop_page=By.id("com.boopathy.raja.tutorial:id/DragDrop_Image");
    By Simple_DragDrop_page=By.id("com.boopathy.raja.tutorial:id/DragDrop_Drag1");
    By exit_button=By.xpath("//android.widget.LinearLayout[3]/android.widget.LinearLayout");
    public Third(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement  DragDrop_option(){return driver.findElement(DragDrop_option);}
    public WebElement  DragDrop_button(){return driver.findElement(DragDrop_button);}
    public WebElement  Simple_DragDrop_button(){return driver.findElement(Simple_DragDrop_button);}
    public WebElement  DragDrop_page(){return driver.findElement(DragDrop_page);}
    public WebElement  Simple_DragDrop_page(){return driver.findElement(Simple_DragDrop_page);}
    public WebElement  exit_button(){return driver.findElement(exit_button);}
    public void previous_page() {
        driver.navigate().back();
    }
}


