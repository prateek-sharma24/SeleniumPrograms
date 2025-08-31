package org.example.ex08_SVG_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium34_JS_Demo_2 {
    ChromeDriver driver;
    @BeforeTest
    public void Open_Browser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =new ChromeDriver(chromeOptions);
    }
    @Description("Verify JS")
    @Test
    public void test_js()
    {
        driver.get("https://selectorshub.com/xpath-practice-page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        String URL = js.executeScript("return document.URL;").toString();
        String title =js.executeScript("return document.title;").toString();
        System.out.println(URL);
        System.out.println(title);

    }
    public void Close_Browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
