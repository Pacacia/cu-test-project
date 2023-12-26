package Tests;
import org.testng.annotations.Test;
import pageobjects.BaseTest;
import pageobjects.navigationpanel.*;
public class MyTests extends BaseTest {

    @Test(priority = 1, testName = "Login")
    public void test1()  {
        LoginPage loginPage = new LoginPage(driver, wait);
        // verify main page header elements (6 element)
        loginPage.login();
        System.out.println("Home Page Success");
    }
}
