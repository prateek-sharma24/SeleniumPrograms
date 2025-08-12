package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSelenium04 {
    //Webdriver hierarchy

    //SearchContext(I)->(2) ->WebDriver(I)(10) -> RemoteWebDriver(C) (15)
    //->ChromiumDriver(C) 25 ->EdgeDriver(C) (45)


    //SearchContext(Interface)-findElement, and findElements -GGF
    //WebDriver(Interface)-some incomplete functions -GF
    //RemoteWebDriver(Class) -Class -It also has some functions -F
    //ChromiumDriver(Class)
    //ChromeDriver(Class), EdgeDriver(Class), BraveBrowser(Class)
    //Firefox ->gecko
    //Safari ->Applekit


    public static void main(String[] args) {
        SearchContext driver = new ChromeDriver();
        //Search Context driver1 =new FirefoxDriver();
        //SearchContext driver2 =new InternetExplorerDriver();


        //Scenarios
        //1. Do you want run on Chrom or Edge?
        //ChromeDriver driver =new ChromeDriver();
        //2. Do you want run on Chrome then change to edge
       // WebDriver driver =new ChromeDriver();
        driver =new EdgeDriver();



        //3. Do you want run on multiple browsers , aws machine
        //RemoteWebDriver driver (with GRID)-Advance(Last 2 sessions)


    }
}
