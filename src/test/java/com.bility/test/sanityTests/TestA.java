package com.bility.test.sanityTests;


import com.bility.framework.TestGroups;
import com.bility.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestA extends BaseTest {


    @Parameters({"browserType", "appURL"})
    @BeforeClass(alwaysRun = true)
    private void setUp(String browserType, String appUR) {
        initializeTestBaseSetup(browserType, appUR);
    }

    @Test(groups = TestGroups.SMOKE)
    public void firstTestCaseA() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in FirstTestCaseA case from TestA Class");

    }

    @Test(groups = TestGroups.SANITY)
    public void secondWebSiteA() throws Exception {
        Thread.sleep(1000);
        System.out.println("I am in SecondTestCaseA case from TestA Class");

        //Below statement will throw exception

        WebElement ele = driver.findElement(By.id("test"));
        ele.click();
    }

    @Test(groups = TestGroups.SANITY)
    public void testYahooSearch(){
        assertThat(driver.getTitle(), is("Yahoo"));
    }

    @Test(groups = TestGroups.SANITY)
    public void thirdTestCaseA() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in ThirdTestCaseA case from TestA Class");
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}