package org.example.ex06_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium24_Fix_Mini_Project {
    @Owner("Prateek")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that the error message comes with invalid email on signup page")
    @Test
    public void verify_error_message()
    {
        //Step-1>Load the browser and enter the URL of the website
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

        //Step-2>Find the email id and enter the email as admin@admin.com
        WebElement email_id=driver.findElement(By.xpath("//input[@id='login-username']"));
        email_id.sendKeys("admin@admin.com");

        //Step-3>Find the pass input box and enter the password as admin
        WebElement password=driver.findElement(By.xpath("//input[@id='login-password']"));
        password.sendKeys("admin");

        //Step-4> Find and click on the submit button
        WebElement login_button = driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        login_button.click();

        //Step-5>Verify that the error message is shown "Your email, password, IP"

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        //Applying implicit wait until the error message appears on the page
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        //close the session for the test case
        driver.quit();

    }
}
