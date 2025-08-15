package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium13_NOHTTP {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        //driver.get("bing.com");//HTTPs is important as without the protocol it will be non functional
        driver.get("https://google.com");
        driver.quit();

    }
}
