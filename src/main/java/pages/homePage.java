package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By accountManagerIcon = By.xpath("//div[contains(@class,'dropdown cart-dropdown clsMobileLogin')]");
    private final By sigunUpButton= By.className("clsRlink");
    private final By logoutButton=By.xpath("//p[@class=\"welcome-msg\"]//a[text()='Logout']");
    private final By contactUsPage=By.xpath("//div[@class=\"header-top\"]//a[text()='Contact Us']");

    public homePage(WebDriver driver){
        this.driver=driver;
    }

    public void navigateToRegisterPage() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(accountManagerIcon)));
        driver.findElement(accountManagerIcon).click();
        Thread.sleep(2000);
        driver.findElement(sigunUpButton).click();
    }
    public void navigateToLoginPage(){
        driver.findElement(accountManagerIcon).click();
    }
    public void navigateToContactPage() throws InterruptedException {
       /* wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(contactUsLink));*/
        Thread.sleep(2000);
        driver.findElement(contactUsPage).click();
    }
}
