package org.example.ex10_FileUpload;

import org.example.ex02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium40_FileUpload extends CommonToAll {
    @Test
    public void test_file_upload()
    {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement file_upload =driver.findElement(By.id("fileToUpload"));
    }
}
