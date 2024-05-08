package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {
    WebDriver driver;
    WebDriverWait wait;
    private final By emailTxt  = By.xpath("//input[@id=\"notifyemail\"]");
    private final By passwordTxt = By.id("notifypassword");
    private final By signInButton = By.xpath("//div[@class=\"clsLNotify\"]//input[@id=\"submit\"]");

    public loginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterLoginData(String email,String password){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(emailTxt)));
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(signInButton)));
        driver.findElement(signInButton).click();
    }
}
