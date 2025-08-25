package org.example.ex06_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestSelenium23_Implicit_Waits {
    @Description("Verify the Ebay search for iMac")
    @Test
    public void test_verify_search_imac() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));


        // Open eBay
        driver.get("https://www.ebay.com/");


        // Close browser
        driver.quit();
    }
}

