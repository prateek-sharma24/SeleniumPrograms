package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Mini_Project_2_Add_Extensions {

    @Test
    public void test_selenium03() throws Exception
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addExtensions(new File("src/test/java/org/example/ex02_Selenium_Basics/Adblock.crx"));
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com");
        driver.manage().deleteAllCookies();
        driver.quit();    }
}
