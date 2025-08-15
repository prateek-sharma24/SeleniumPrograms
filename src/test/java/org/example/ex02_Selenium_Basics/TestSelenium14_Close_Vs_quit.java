package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium14_Close_Vs_quit {
    @Test
    public void test_selenium02() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");

        Thread.sleep(5000);

        driver.close();
        // close() -> closes the current browser window/tab that the driver is focused on.
        // The WebDriver session is still alive if other windows are open.
        // Session ID is NOT null until all windows are closed.

        // quit() -> closes all browser windows opened by the driver
        // and ends the WebDriver session (Session ID becomes null).
    }
}

