package org.example.ex09_ActionClass;

import org.example.ex02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium39_ActionClass_P5 extends CommonToAll {
    @Test
    public void test_drag_drop()
    {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement from =driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();
    }
}
