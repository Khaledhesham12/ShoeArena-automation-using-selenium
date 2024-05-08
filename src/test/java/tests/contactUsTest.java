package tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.contactUsPage;
import pages.homePage;
import data.contactUsData;

import java.io.IOException;


public class contactUsTest extends testBase{

    contactUsPage contact;
    homePage home;


    @Test(description = "Validate that the user can contact successfully ")
    public void validateContact() throws InterruptedException, IOException, ParseException {
        home=new homePage(driver);
        home.navigateToContactPage();
        contact=new contactUsPage(driver);
        contactUsData data=new contactUsData();
        data.ContactUsData();
        contact.enterContactData(
                data.mobile,data.subject,data.message);
    }

}
