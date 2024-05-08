package tests;

import data.registerData;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import pages.registerPage;

import java.io.IOException;

public class loginTest extends testBase{
    loginPage login;

    homePage home;
    @Test(description = "Validate that the user can login with valid data successfully")
    public void validateLogin() throws InterruptedException, IOException, ParseException {
       home=new homePage(driver);
       home.navigateToLoginPage();
       registerData data = new registerData();
       data.RegisterData();
       login=new loginPage(driver);
       login.enterLoginData(data.email,data.password);
    }


}
