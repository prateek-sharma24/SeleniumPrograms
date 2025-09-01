package org.example.ex09_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium35_ActionClass {
    ChromeDriver driver;
    @BeforeTest
    public void OpenBrowser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =new ChromeDriver(chromeOptions);
    }
    @Test
    public void test_actions()
    {
        driver.get("https://awesomeqa.com/practice.html");
        //1>Enter the first name using Actions class using shift key up and down
        WebElement first_name = driver.findElement(By.name("firstname"));
        Actions actions =new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(first_name,"prateek")
                .keyUp(Keys.SHIFT).build().perform();
        //2>enter the last name using actions classes using shift key up and down
        WebElement last_name =driver.findElement(By.name("lastname"));
        actions.moveToElement(last_name)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys(last_name,"sharma")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
