package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class contactUsPage {
    private WebDriver driver;

    Select select;

    private final By mobileTxt = By.id("contact-mobile");
    private final By messegeTxt = By.id("contact-enquiry");
    private final By subjectForm = By.id("contact-subject");
    private final By submitButton = By.name("submit");
    public contactUsPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterContactData(){
        driver.findElement(mobileTxt).sendKeys("01147690862");
        driver.findElement(mobileTxt).sendKeys("jkgdk");
        select =new Select(driver.findElement(subjectForm));
        select.selectByVisibleText(" Returns ");
        driver.findElement(messegeTxt).sendKeys("kakakkakaka");
        driver.findElement(submitButton).click();
    }
}
