package org.example.ex09_ActionClass;

import org.example.ex02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium37_ActionClass_MakeMyTrip_Example extends CommonToAll {
    @Test
    public void test_MMT() {
        driver.get("https://www.makemytrip.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Close login modal
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']"))).click();

        // Click on "From" field to activate dropdown
        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        fromCity.click();

        // Locate the actual input box that appears inside dropdown
        WebElement inputBox = driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']/div/input"));

        // Use Actions to type IXC
        Actions actions = new Actions(driver);
        actions.moveToElement(inputBox).click().sendKeys("IXC").perform();

        // Wait for suggestions and pick Chandigarh Airport
        WebElement suggestion = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//p[contains(text(),'Chandigarh Airport')]")));

        actions.moveToElement(suggestion).click().perform();
    }

}
