package pageobjects.navigationpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }
    public String signUp() {
        WebElement navLogin = driver.findElement(By.id("signin2"));
        navLogin.click();
        WebElement username = driver.findElement(By.id("sign-username"));
        username.sendKeys("user_"+ new Random().nextInt(1000000));
        WebElement password = driver.findElement(By.id("sign-password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
        loginButton.click();
        return null;
    }
}
