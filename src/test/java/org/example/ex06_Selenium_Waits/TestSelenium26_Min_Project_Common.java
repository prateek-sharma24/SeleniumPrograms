package org.example.ex06_Selenium_Waits;

import io.qameta.allure.Description;
import org.example.ex02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_Min_Project_Common extends CommonToAll {
    @Description("Verify Make My Trip opens with modal")
    @Test
    public void modal_locator()
    {
        //Step-1>load the browser and open the website
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.navigate().to("https://makemytrip.com");
        System.out.println(driver.getTitle());

        waitForVisibility(driver,3,"span[data-cy='closeModal']");

        WebElement close_button= driver.findElement(By.cssSelector("span[data-cy='closeModal']"));
        close_button.click();
    }
}
