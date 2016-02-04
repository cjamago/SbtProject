package com.bility.test.regressionTests;

import com.bility.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class YahooTest extends BaseTest {

    @Parameters({"browserType", "appURL"})
    @BeforeClass
    public void setUp(String browserType, String appUR) {
        initializeTestBaseSetup(browserType, appUR);
    }

    @Test(enabled = true, groups = "smoke")
    public void yahooSearch() throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("UHSearchBox"));

        element.sendKeys("Cheese!");

        element.submit();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        // Should see: "cheese! - Google Search"
        Assert.assertTrue("Cheese! - Yahoo Search Results".equalsIgnoreCase(driver.getTitle()));
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
