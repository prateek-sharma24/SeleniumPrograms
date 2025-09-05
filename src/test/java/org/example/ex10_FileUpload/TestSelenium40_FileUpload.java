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
        String working_dir = System.getProperty("user.dir");
        //the full path if given will work on my machine not on other machines
        //C:\Users\shiv\IdeaProjects\SeleniumPrograms
        String path_file =working_dir+"/src/test/java/org/example/Dat.txt";
        file_upload.sendKeys(path_file);
        WebElement upload_button =driver.findElement(By.name("submit"));
        upload_button.click();


    }
}
