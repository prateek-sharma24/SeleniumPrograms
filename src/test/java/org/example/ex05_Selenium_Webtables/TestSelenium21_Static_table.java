package org.example.ex05_Selenium_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium21_Static_table {
    @Test(groups ="QA")
    @Description("Verify the static web tables")
    public void test_web_table_login()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/webtable.html");

        //Xpath to reach a particular element of the table-//table[@id='customers']/tbody/tr[6]/td[3]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        for (int i = 2; i <=rows ; i++) {
            for (int j=1;j<=col;j++)
            {
                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
                if(data.contains("Giovanni Rovelli")) {
                    String country_path =dynamic_path+"/following-sibling::td";
                    String country_text=driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("--------");
                    System.out.println("Giovanni Rovelli is in-"+country_text);
                }
                }
            }

        }

    }

