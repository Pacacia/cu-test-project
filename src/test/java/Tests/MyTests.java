package Tests;
import org.testng.annotations.Test;
import pageobjects.BaseTest;
import pageobjects.navigationpanel.*;
public class MyTests extends BaseTest {

    @Test(priority = 1, testName = "Login")
    public void test1()  {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login();
        System.out.println("Home Page Success");
    }

    @Test(priority = 2, testName = "SignUp")
    public void test2()  {
        SignUpPage loginPage = new SignUpPage(driver, wait);
        loginPage.signUp();
        System.out.println("SignUp Success");
    }
}
