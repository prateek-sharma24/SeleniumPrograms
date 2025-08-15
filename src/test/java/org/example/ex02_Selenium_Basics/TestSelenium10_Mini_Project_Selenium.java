package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_Mini_Project_Selenium extends CommonToAll{
    @Description("Open the URL")
    @Test
    public void test_Selenium010() throws Exception
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if (driver.getPageSource().contains("CURA Healthcare"))
        {
            System.out.println("Test Case is passed");
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("CURA Healthcare Service is not visible");
            //throw new Exception("CURA Healthcare Service is not visible")
        }
        closeBrowser(driver);
    }


}
