package org.example.ex08_SVG_Shadow_DOM;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium33_JS_Demo {
    ChromeDriver driver;

    @BeforeTest
    public void Open_Browser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    // ✅ Utility method for shadow DOM element fetching
    public WebElement getShadowElement(String script) {
        return (WebElement) ((JavascriptExecutor) driver).executeScript(script);
    }

    @Description("Verify JS executor")
    @Test
    public void JS_executor() {
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to bring shadow DOM into view
        WebElement div_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);", div_scroll);

        // Wait until shadow DOM element exists
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement inputboxPizza = wait.until(driver ->
                getShadowElement(
                        "let pact = document.querySelector('#pact');" +
                                "if(!pact) return null;" +
                                "let app2 = pact.shadowRoot.querySelector('#app2');" +
                                "if(!app2) return null;" +
                                "let pizza = app2.shadowRoot.querySelector('#pizza');" +
                                "return pizza;"
                )
        );

        // Type into the pizza box
        inputboxPizza.sendKeys("farmhouse");
    }

    @AfterTest
    public void Close_browser() {
        try {
            Thread.sleep(5000); // shorter wait
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
