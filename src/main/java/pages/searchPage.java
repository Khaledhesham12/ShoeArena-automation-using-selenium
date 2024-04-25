package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class searchPage {
    WebDriver driver;
    private final By searchBox= By.id("search-box");
    private final By firstProduct=By.xpath("//a[@title='Hoops Men Football Shoes Orange']");
    private Robot robot;
    private WebDriverWait wait;
    public searchPage(WebDriver driver){
        this.driver=driver;
    }

    public void serachForItem() throws AWTException {
        driver.findElement(searchBox).sendKeys("Hoops Men Football Shoes Orange");
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstProduct)));
        driver.findElement(firstProduct).click();
    }
}

