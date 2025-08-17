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

public class TestSelenium19_Mini_Project2_TagName {
    @Owner("Prateek")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that the error message comes with invalid email on signup page")
    @Test
    public void vwo_free_trial_error_verify() throws InterruptedException {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);

        //Step 1>Open the browser and redirect yourself to website URL
        driver.get("https://app.vwo.com");

        //Step-2>CLick on start free trial link
        WebElement sign_up_link = driver.findElement(By.partialLinkText("Start a free trial"));
        sign_up_link.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        //Step-3>Enter the incorrect email id
        WebElement email_id_input_field =driver.findElement(By.id("page-v1-step1-email"));
        email_id_input_field.sendKeys("admin");

        //Step-4>Click on check box in order to accept the permissions
        WebElement permission_check_box =driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        permission_check_box.click();

        //Step-5>Click on create a free trial account button
        WebElement create_free_trial_account_button = driver.findElement(By.tagName("button"));
        create_free_trial_account_button.click();

        //Step-5>Verify that the error message comes with invalid email on signup page
        Thread.sleep(3000);
        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");
        driver.quit();
    }
}
