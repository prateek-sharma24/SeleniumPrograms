package org.example.ex07_Input_Select_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium28_Input_Checkbox_Radio {
    public static void main(String[] args) {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        //INPUT
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("name");

        //RADIO Box
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        //Check Box
        driver.findElement(By.xpath("//input[@id='profession-0']")).click();


    }
}
