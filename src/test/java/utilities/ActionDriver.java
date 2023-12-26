package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;



public class ActionDriver {
    public static void selectOptionByValue(WebDriverWait wait, By optionsLocator, String value) {
        List<WebElement> options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(optionsLocator));
        for (WebElement option : options) {
            if (option.getText().trim().equals(value)) {
                option.click();
                break;
            }
        }
    }

    public static void headerNavigationElements(WebDriverWait wait, By optionsLocator) {
        //List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(optionsLocator));
        List<WebElement> headerElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(optionsLocator));
        for (WebElement headerElement : headerElements) {
            System.out.println(headerElement);
        }
    }
}

