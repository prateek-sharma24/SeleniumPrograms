package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Change_Driver {
    public static void main(String[] args) {
        //ChromeDriver driver = new ChromeDriver();
        //driver =new FirefoxDriver();

        WebDriver driver =new ChromeDriver();
        driver =new FirefoxDriver();
    }
}
