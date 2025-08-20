package org.example.ex05_Selenium_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium22_Dynamic_Table {
    @Test
    @Description("Test Case description")
    public void test_Dynamic_table()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        //Find the XPath for the WebTable
        //  ////table[@summary='Sample Table']

        WebElement table =driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        //rows and columns
        List<WebElement> rows_table =table.findElements(By.tagName("tr"));
        for(int i=0;i< rows_table.size();i++)
        {
            List<WebElement> column_table =rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c: column_table)
            {
                System.out.println(c.getText());
            }
        }
    }

}
