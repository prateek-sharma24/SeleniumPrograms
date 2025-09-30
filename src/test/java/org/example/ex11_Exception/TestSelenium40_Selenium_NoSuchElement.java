package org.example.ex11_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium40_Selenium_NoSuchElement {

    @Description("Verify RL")
    @Test
    public void test_actions()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        try {
            driver.findElement(By.id("prateek"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }
        driver.quit();
    }
}
