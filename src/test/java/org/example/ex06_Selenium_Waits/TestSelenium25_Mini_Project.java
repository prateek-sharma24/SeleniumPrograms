package org.example.ex06_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium25_Mini_Project {
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

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-cy='closeModal']")));

        WebElement close_button= driver.findElement(By.cssSelector("span[data-cy='closeModal']"));
        close_button.click();
    }
}
