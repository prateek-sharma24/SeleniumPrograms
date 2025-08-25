package org.example.ex07_Input_Select_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium29_Select_Static {
    public static void main(String[] args) {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement drop_down = driver.findElement(By.id("dropdown"));
        Select select =new Select(drop_down);
        //Selection by Index
        //select.selectByIndex(1);
        //Select by visible text
        //select.selectByVisibleText("Option 1");
        //Select by Value
        select.selectByValue("2");
    }
}
