package tests;

import org.testng.annotations.Test;
import pages.searchPage;

import java.awt.*;


public class searchTest extends testBase {
     searchPage search;

    @Test(description = "validate that the user can search for item successfully")
    public void search() throws AWTException {
        search = new searchPage(driver);
        search.serachForItem();
    }

}
