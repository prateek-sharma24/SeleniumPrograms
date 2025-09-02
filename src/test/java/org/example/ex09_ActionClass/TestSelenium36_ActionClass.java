package org.example.ex09_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium36_ActionClass {
    @Test
    public void test_action_class()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("-start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://www.spicejet.com/");
        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        Actions actions =new Actions(driver);
        //move to the element
        actions.moveToElement(source)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("del")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
