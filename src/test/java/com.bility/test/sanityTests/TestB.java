package com.bility.test.sanityTests;

import com.bility.framework.TestGroups;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestB {

    @Test(groups = TestGroups.SANITY)
    public void firstTestCaseB() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in FirstTestCaseB case from TestB Class");
    }

    @Test(groups = TestGroups.SANITY)
    public void secondTestCaseB() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am in SecondTestCaseB case from TestB Class");
        Assert.fail("Failing this Test");
    }

    @Test(groups = TestGroups.SANITY)
    public void thirdTestCaseB() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in ThirdTestCaseB case from TestB Class");
    }

    @Test(groups = TestGroups.SANITY)
    public void fourthTestCaseB() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in FourthTestCaseB case from TestB Class");
    }

    @Test(groups = TestGroups.SANITY)
    public void fifthTestCaseB() throws Exception {
        Thread.sleep(2000);
        System.out.println("I am in FifthTestCaseB case from TestB Class");
    }
}