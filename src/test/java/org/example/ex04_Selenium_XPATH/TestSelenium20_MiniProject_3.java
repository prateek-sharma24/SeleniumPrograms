package org.example.ex04_Selenium_XPATH;

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

import java.util.List;

public class TestSelenium20_MiniProject_3 {
    @Owner("Prateek")
    @Severity(SeverityLevel.CRITICAL)
     @Description("Verify that the user has logged in to the platform and verify the appointment page")
    @Test
    public void test_CURA_Login() throws InterruptedException {
         //Step 1-Open the browser and redirect to Home page of the platform
         ChromeOptions chromeOptions =new ChromeOptions();
         chromeOptions.addArguments("--start-maximized");
         WebDriver driver =new ChromeDriver(chromeOptions);
         driver.get("https://katalon-demo-cura.herokuapp.com/");

         //Step-2>Click on make appointment button and redirect to the login page
         WebElement make_appointment_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
         make_appointment_button.click();

         //Step-3>Enter the username and password and try to login to the platform
        //Creating xpath by id
         //WebElement username =driver.findElement(By.xpath("input[@id='txt-username']"));
         //username.sendKeys("John Doe");
         //creating xpath via placeholder in which there are 2 entries and user tries to fetch one
        List<WebElement> username =driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username.get(1).sendKeys("John Doe");
        List<WebElement> password =driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password.get(1).sendKeys("ThisIsNotAPassword");
                 WebElement login_button =driver.findElement(By.xpath("//button[@id='btn-login']"));
         login_button.click();

         //Step-4>Verify the redirected page using assertion in order to check whether the user has been redirected to teh correct page
         Thread.sleep(5000);

         Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
         driver.quit();

     }
}
