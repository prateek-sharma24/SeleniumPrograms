package org.example.ex06_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium27_Fluent_Wait {
    @Description("Verify the Fluent wait for the webiste")
    @Test
    public void fluent_wait()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // 1. Find the email input box and enter the email
        WebElement email= driver.findElement(By.xpath("//input[@data-qa='hocewoqisi']"));
        email.sendKeys("admin@admin.com");

        // 2. Find the password field and enter the password
        WebElement password =driver.findElement(By.xpath("//input[@data-qa='jobodapuxe']"));
        password.sendKeys("password@123");

        //3. Find the login button and click the same
        WebElement login_button = driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        login_button.click();

        //4. Use Fluent wait in order to load the error message
        FluentWait<WebDriver> wait =new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement error_message =wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div[@data-qa='tozemoxine']"));
            }
        });
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }


}
