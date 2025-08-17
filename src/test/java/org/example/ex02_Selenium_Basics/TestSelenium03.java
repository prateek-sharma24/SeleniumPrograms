package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    @Description("Open the app.vwo.com and get the title")
    @Test
    public void test_Selenium01()
    {
        //Selenium3
        //You need to setup the driver(browser)
        //System.getProperty("webdriver.geckodriver","pathgeckodriver");

        //Selenium4
        //Selenium Manager -utility -which can download the driver automatically
        //Start and Stop itself.
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://google.com");

    }
}
