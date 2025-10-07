package org.example.ex11_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium42_Selenium_NoSuchElement_Actual_Fix {
    ChromeDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =new ChromeDriver(chromeOptions);
    }
    @Description("Verify Stale Element Reference Exception")
    @Test
    public void test_exceptions()
    {
        try {
            driver.get("https://www.google.com/");
            WebElement search_box=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();//HTML page(DOM) is now refreshed
            //Driver will think that element may or may not be available now
            // I have found element before refresh
            //, navigate other page, change in DOM elements (AJAX Calls)
            //If you want to fix the stale element exp-refind the element after DOM changes
            search_box=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_box.sendKeys("thetestingacademy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("other code run");
        System.out.println("end of the program");

    }
    @AfterTest
    public void closeBrowser()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
