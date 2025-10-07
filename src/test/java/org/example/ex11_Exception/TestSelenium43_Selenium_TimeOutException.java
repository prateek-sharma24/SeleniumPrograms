package org.example.ex11_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Time;
import java.time.Duration;

public class TestSelenium43_Selenium_TimeOutException {
    ChromeDriver driver;
    @BeforeTest
    public void Open_Browser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =new ChromeDriver(chromeOptions);

    }
    @Description("Verify Time Out Exception")
    @Test
    public void test_actions()
    {
        try {
            driver.get("https://google.com");
            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));
            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_inputbox.sendKeys("the testing academy");
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end of the program");

    }
    @AfterTest
    public void closeBrowser()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
