package tests;


import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.homePage;
import pages.registerPage;
import data.registerData;

import java.io.IOException;


public class registerTest extends testBase{
    registerPage register;
    homePage home;

    @Test(description = "Validate that the User can register with valid account successfully")
    public void validateRegister() throws InterruptedException, IOException, ParseException {
        home = new homePage(driver);
        home.navigateToRegisterPage();
        register = new registerPage(driver);
        registerData data = new registerData();
        data.RegisterData();
        register.enterRegisterationData(
                data.firstName,data.lastName,data.email,data.password );
    }

}
