package org.example.ex11_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium41_Selenium_StaleelementReferenceException {
    ChromeDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
         driver =new ChromeDriver(chromeOptions);
    }
    @Description("Verify Stale Element Reference Exception")
    @Test
    public void test_exceptions()
    {
        driver.get("https//app.vwo.com/");
    }
}
