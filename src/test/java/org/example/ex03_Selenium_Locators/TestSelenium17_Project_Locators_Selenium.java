package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium {
    @Description("TC#1 -Verify that the invalid login, error message is displayed")
    @Owner("Prateek")
    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void test_vwo_invalid_login()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

    }

}
