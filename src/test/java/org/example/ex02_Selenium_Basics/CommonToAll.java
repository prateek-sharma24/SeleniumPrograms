package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
