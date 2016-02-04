package com.bility.test.sanityTests;

import com.bility.framework.TestGroups;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestC {

    @Test(groups = TestGroups.SANITY)
    public void firstTestCaseB() throws Exception {
        Thread.sleep(100);
        System.out.println("I am in FirstTestCaseC case from TestC Class");
    }

    @Test(groups = TestGroups.SANITY)
    public void secondTestCaseB() throws Exception {
        Thread.sleep(5000);
        System.out.println("I am in SecondTestCaseC case from TestC Class");
        throw new SkipException("Skipping this test with exception");
    }
}
