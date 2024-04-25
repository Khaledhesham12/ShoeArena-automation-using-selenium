package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import pages.registerPage;

public class loginTest extends testBase{
    loginPage login;

    homePage home;
    @Test
    public void validateLogin() throws InterruptedException {
       home=new homePage(driver);
       home.navigateToLoginPage();
       login=new loginPage(driver);
       login.enterLoginData();
    }


}
