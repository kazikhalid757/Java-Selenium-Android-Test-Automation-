package pages.LocatorPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Second {

    public AppiumDriver driver;
    By Arc_option=By.xpath("//android.widget.ListView/android.widget.LinearLayout[3]");
    By Arc_menu_button=By.id("com.boopathy.raja.tutorial:id/ArcMenu");
    By Arc_menu_options=By.id("com.boopathy.raja.tutorial:id/arc_main");
    By Arc_menu_options_menu=By.id("com.boopathy.raja.tutorial:id/menu");
    By Chart_option=By.xpath("//android.widget.ListView/android.widget.LinearLayout[4]");
    By BarChart=By.id("com.boopathy.raja.tutorial:id/BarChart");
    By PieChart=By.id("com.boopathy.raja.tutorial:id/PieChart");
    By BarChart_page=By.xpath("//android.widget.FrameLayout[2]/android.view.View");
    By PieChart_page=By.xpath("//android.widget.LinearLayout/android.view.View");

    public Second(AppiumDriver driver) {
        this.driver = driver;
    }


    public WebElement  Arc_option(){return driver.findElement(Arc_option);}
    public WebElement  Arc_menu_button(){return driver.findElement(Arc_menu_button);}
    public WebElement  Arc_menu_options(){return driver.findElement(Arc_menu_options);}
    public WebElement  Arc_menu_options_menu(){return driver.findElement(Arc_menu_options_menu);}
    public WebElement  Chart_option(){return driver.findElement(Chart_option);}
    public WebElement  BarChart(){return driver.findElement(BarChart);}
    public WebElement  PieChart(){return driver.findElement(PieChart);}
    public WebElement  BarChart_page(){return driver.findElement(BarChart_page);}
    public WebElement  PieChart_page(){return driver.findElement(PieChart_page);}
    public void previous_page() {
        driver.navigate().back();
    }

}