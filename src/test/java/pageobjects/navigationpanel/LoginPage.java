package pageobjects.navigationpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }
    public String login() {
        WebElement navLogin = driver.findElement(By.id("login2"));
        navLogin.click();
        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("test");
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        loginButton.click();
        return null;
    }
}
