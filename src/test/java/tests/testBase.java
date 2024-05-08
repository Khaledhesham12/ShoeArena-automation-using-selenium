package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testBase {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.shoearena.sa/en");
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
