package org.example.ex09_ActionClass;

import org.example.ex02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium38_ActionClass_P4  extends CommonToAll {
    @Test
    public void page_up_page_down()
    {
        driver.get("https://thetestingacademy.com/");
        Actions actions  = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();;
    }
}
