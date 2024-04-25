package tests;


import org.testng.annotations.Test;
import pages.homePage;
import pages.registerPage;


public class registerTest extends testBase{
    registerPage register;
    homePage home;

    @Test
    public void validateRegister() throws InterruptedException  {
        home = new homePage(driver);
        home.navigateToRegisterPage();
        register = new registerPage(driver);
        register.enterRegisterationData();
    }

}
