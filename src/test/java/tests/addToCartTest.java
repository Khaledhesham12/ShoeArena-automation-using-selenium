package tests;

import org.testng.annotations.Test;
import pages.addToCartPage;
import pages.searchPage;

import java.awt.*;

public class addToCartTest extends testBase{
    addToCartPage addToCart;
    searchPage search;


    @Test()
    public void validateAddTocart() throws AWTException {
        search = new searchPage(driver);
        search.serachForItem();
        addToCart = new addToCartPage(driver);
        addToCart.addToCart();
    }
}
