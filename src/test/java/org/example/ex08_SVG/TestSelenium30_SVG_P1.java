package org.example.ex08_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium30_SVG_P1 {

    ChromeDriver driver;
    @BeforeTest
    public void OpenBrowser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
         driver =new ChromeDriver(chromeOptions);
    }
    @Description("Verify that after the search, results are visible")
    @Test
    public void flipkart_search()
    {
        driver.get("https://www.flipkart.com");
        System.out.println(driver.getTitle());

        //Step-1>Enter the macmini in the input box
        WebElement search_bar = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
        search_bar.sendKeys("macmini");

        //Step-2>Click on teh SVG element
        List<WebElement> svgElements =driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();
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
