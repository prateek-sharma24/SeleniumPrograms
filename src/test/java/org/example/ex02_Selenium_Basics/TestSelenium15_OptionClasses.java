package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionClasses {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions =new ChromeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?
        //chromeOptions.addArguments("--windows-size=1280,720");
        //chromeOptions.addArguments("--windows-size=800,600");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        ChromeDriver driver =new ChromeDriver(chromeOptions);


        Thread.sleep(5000);
        driver.quit();

    }
}
