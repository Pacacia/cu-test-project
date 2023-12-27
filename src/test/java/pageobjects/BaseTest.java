package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static String SiteUrl = "https://www.demoblaze.com/index.html";
    public static String DriverLocation = "driver/chromedriver-mac-arm64/chromedriver";

    @BeforeMethod
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", DriverLocation);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(SiteUrl);


    }

//    @AfterMethod
//    public void tearDown() {
//       if(driver !=null) {
//         driver.close();
//          driver.quit();
//       }
//   }
}
