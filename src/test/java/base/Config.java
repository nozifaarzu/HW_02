package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Config {
    //initialize the driver
    //use static so no changes can be made by others
    public static WebDriver driver;

    //setup browser type
    public static WebDriver setupBrowser(String driverType){
        if (driverType.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(driverType.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(driverType.equalsIgnoreCase("Safari")){
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;

    }
}