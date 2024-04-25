package tests;

import org.testng.annotations.Test;
import pages.contactUsPage;
import pages.homePage;
import pages.registerPage;

public class contactUsTest extends testBase{
    registerPage register;
    contactUsPage contact;
    homePage home;


    @Test
    public void validateContact() throws InterruptedException {
        home=new homePage(driver);
        home.navigateToContactPage();
        contact=new contactUsPage(driver);
        contact.enterContactData();
    }

}
