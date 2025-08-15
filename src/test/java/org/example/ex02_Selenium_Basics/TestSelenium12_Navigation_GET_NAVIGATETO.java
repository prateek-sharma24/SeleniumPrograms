package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_GET_NAVIGATETO {
    @Description("Open the URL")
    @Test
    public void test_Selenium01()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https//google.com");

        //Use the navigation commands
        //driver.get("url")->Navigate to a URL

        //Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
