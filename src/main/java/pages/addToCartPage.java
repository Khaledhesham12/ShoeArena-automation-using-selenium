package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addToCartPage {
    WebDriver driver;
    WebDriverWait wait;
    private final By size =By.xpath("//li[@data-eu=\"40\"]");
    private final By addToCartButton=By.xpath("//a[@title=\"Add to Shopping Bag\"]");
    private final By viewCartButton= By.xpath("//button[text()='View Cart']");
    public addToCartPage(WebDriver driver){
        this.driver=driver;
    }
    public void addToCart(){
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(size)));
        driver.findElement(size).click();
        driver.findElement(addToCartButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewCartButton));
        driver.findElement(viewCartButton).click();
    }
}
