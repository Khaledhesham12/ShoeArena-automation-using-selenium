package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class registerPage {
     private  WebDriver driver;
     private WebDriverWait wait;

    private final By firstNameTxt = By.id("registerfirst");
    private final By lastNameTxt = By.id("registerlast");
    private final By emailTxt = By.id("registeremail");
    private final By passwordTxt = By.id("registerpassword");
    private final By gender = By.xpath("//input[@value=\"male\"]");
    private final By submitButton = By.xpath("//div[@class=\"clsNotRegister\"]//input[@id=\"submit\"]");
    public registerPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterRegisterationData(String firstName, String lastName, String email, String password){
        driver.findElement(firstNameTxt).sendKeys(firstName);
        driver.findElement(lastNameTxt).sendKeys(lastName);
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(gender).click();
        driver.findElement(submitButton).click();
    }

}
