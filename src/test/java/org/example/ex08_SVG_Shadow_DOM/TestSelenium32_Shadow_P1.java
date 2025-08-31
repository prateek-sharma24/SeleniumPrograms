package org.example.ex08_SVG_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium32_Shadow_P1 {
    ChromeDriver driver;

    @BeforeTest
    public void Open_Browser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @Description()
    @Test
    public void test_Shadow_DOM() {
        //1>Open the browser and enter the URL
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
        WebElement pizza_field = driver.findElement(By.xpath("//input[@id='pizza']"));
        pizza_field.sendKeys("farmhouse");
    }

        @AfterTest
        public void Close_browser()
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();

        }
    }

