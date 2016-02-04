package com.bility.test;

import com.bility.framework.BrowseDriver;

/**
 * Created by chijiokea on 21/01/2016.
 */
public class BaseTest extends BrowseDriver {

    protected void initializeTestBaseSetup(String browserType, String appURL) {
        try {
            setDriver(browserType, appURL);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }
}
