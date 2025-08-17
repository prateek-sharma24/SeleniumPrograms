package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium {
    @Description("TC#1 -Verify that the invalid login, error message is displayed")
    @Owner("Prateek")
    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void test_vwo_invalid_login() throws InterruptedException {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        //Step 1-Find the EMAIL ID and enter the admin@admin.com
        //Step 2- Find the Password and enter 1234
        //Step 3-Find the Submit button and click on the button
        //Step 4-Wait for some time
        //Step 5- Verify the error message

        //Step 1-Find the EMAIL ID and enter the admin@admin.com
        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");
        //Step 2- Find the Password and enter 1234
        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("12345");
        //Step 3-Find the Submit button and click on the button
        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();
        //Step 4-Wait for some time
        Thread.sleep(5000);
        //Step 5- Verify the error message
        WebElement error_message =driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        //Close the session for the test case
        driver.quit();




    }

}
