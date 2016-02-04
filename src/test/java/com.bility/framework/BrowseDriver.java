package com.bility.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Arrays;
import java.util.Optional;

import static com.bility.framework.FunctionalCfg.getPhantomJSDriverPathm;


/**
 * Created by chijiokea on 28/01/2016.
 */
public class BrowseDriver {

    protected static WebDriver driver;
    protected static DesiredCapabilities capabilities;
    protected String browser = System.getProperty("browser"); //use to get browser property from commandline

    protected void setDriver(String browserType, String appURL) {
       String browserDriver = Optional.empty().toString();
        try {
            browserDriver = browser == null | browser.isEmpty()  ? browserType : browser;
        } catch (NullPointerException e){
            e.getCause();
        }

        if (browserDriver.equals("chrome")) {
            initChromeDriver();

            openBrowser(appURL);

        } else if (browserDriver.equals("firefox")) {
            initFirefoxDriver();
            openBrowser(appURL);

        } else if (browserDriver.equals("safari")) {
            initSafariDriver();
            openBrowser(appURL);
        } else if (browserDriver.equals("htmlunit")) {

            initHtmlUnitDriver();
            openBrowser(appURL);

        } else if (browserDriver.equals("phantomjs")) {

            initPhantonJSDriver();
            openBrowser(appURL);

        } else {
            System.out.println("browser : " + browserDriver + " is invalid, Launching Firefox as browser of choice..");
            initFirefoxDriver();
            openBrowser(appURL);
        }

    }

    private WebDriver initHtmlUnitDriver() {
        driver = new HtmlUnitDriver();
        return driver;
    }

    private WebDriver initPhantonJSDriver() {
        capabilities = DesiredCapabilities.phantomjs();
        capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, getPhantomJSDriverPathm());
        driver = new PhantomJSDriver(capabilities);
        return driver;
    }

    private WebDriver openBrowser(String appURL) {
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    protected static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", FunctionalCfg.getChromeDriverPath());
        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--disable-com.bility-security"));
        driver = new ChromeDriver(capabilities);
        return driver;
    }

    protected static WebDriver initFirefoxDriver() {
        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference("getBrowser.download.manager.showWhenStarting", false);
        fp.setPreference("getBrowser.helperApps.neverAsk.saveToDisk", "application/pdf");
        driver = new FirefoxDriver(fp);
        return driver;
    }

    protected static WebDriver initSafariDriver() {
        capabilities = DesiredCapabilities.safari();
        driver = new SafariDriver(capabilities);
        return driver;
    }

}
