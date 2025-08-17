package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Partial_Text_TagName_Locators {
    @Description("Verify VWO")
    @Test
    public void test_login_vwo()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
       // WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("free trial"));
        WebElement a_tag_full_match =driver.findElement(By.linkText("Start a free trial"));
        //a_tag_partial_match.click();
        a_tag_full_match.click();
        driver.quit();



    }
}
