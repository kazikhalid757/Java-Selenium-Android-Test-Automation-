package pages.LocatorPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class First {

    public AppiumDriver driver;


    By  permission_1 = By.id("com.android.permissioncontroller:id/continue_button");
    By permission_2 = By.id( "android:id/button1");
    By Splash = By.xpath("//android.widget.ImageView[@content-desc=\"Android UI Design\"]");
    By welcome_text=By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    By menu_bar=By.id("android:id/up");
    By option_button=By.xpath("//android.widget.LinearLayout[2]/android.widget.TextView");
    By andriod_icon=By.id("com.boopathy.raja.tutorial:id/home_icon");
    By Animations_option=By.xpath("//android.widget.ListView/android.widget.LinearLayout[2]");
    By Alpha_button=By.id("com.boopathy.raja.tutorial:id/Alpha");
    By  Normal_button=By.id("com.boopathy.raja.tutorial:id/animation_button_normal");
    By Alpha05f_button=By.id("com.boopathy.raja.tutorial:id/animation_button_alpha");





    public First(AppiumDriver driver) {
        this.driver = driver;
    }
    public WebElement permission_1() {return driver.findElement(permission_1);}

    public WebElement permission_2() {return driver.findElement(permission_2);}

    public WebElement  Splash(){return driver.findElement(Splash);}
    public WebElement  welcome_text(){return driver.findElement(welcome_text);}
    public WebElement  menu_bar(){return driver.findElement(menu_bar);}
    public WebElement  option_button(){return driver.findElement(option_button);}
    public WebElement  andriod_icon(){return driver.findElement(andriod_icon);}
    public WebElement  Animations_option(){return driver.findElement(Animations_option);}
    public WebElement  Alpha_button(){return driver.findElement(Alpha_button);}
    public WebElement  Normal_button(){return driver.findElement(Normal_button);}
    public WebElement  Alpha05f_button(){return driver.findElement(Alpha05f_button);}




    public void previous_page() {
        driver.navigate().back();
    }


    public void waits_1s() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void waits_2s() throws InterruptedException {
        Thread.sleep(2000);
    }
    public void waits_3s() throws InterruptedException {
        Thread.sleep(3000);
    }
    public void waits_4s() throws InterruptedException {
        Thread.sleep(4000);
    }
    public void waits_5s() throws InterruptedException {
        Thread.sleep(5000);
    }

}
