package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class CommonToAll {
    public void openBrowser(WebDriver driver,String url)
    {
        driver.get(url);
        driver.manage().window().maximize();

    }
    public void closeBrowser(WebDriver driver)
    {
        driver.quit();
    }
    public void waitForVisibility(WebDriver driver, int timeInSeconds , String css)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }
    public void waitForTextToBePresent(WebDriver driver, int timeInSeconds , String css,String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(css)),text));
    }
    public  ChromeDriver driver;
    @BeforeTest
    public void setUp()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);

    }
    @AfterTest
    public void tearDown()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
