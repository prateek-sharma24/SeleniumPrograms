package org.example.ex08_SVG_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium31_SVG_P2 {
    ChromeDriver driver;
    @BeforeTest
    public void Open_Browser()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver =new ChromeDriver(chromeOptions);
    }
    @Test
    @Description("Verify that tripura is in India and click on it")

    public void test_svg_india_search_click()
    {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));
     for (WebElement state : states)
     {
         System.out.println(state.getAttribute("aria-label"));
         if(state.getAttribute("aria-label").contains("Tripura"))
         {
             state.click();
         }
     }

    }
    @AfterTest
    public void Close_Browser()
    {
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {


        }
        driver.quit();
    }
}
