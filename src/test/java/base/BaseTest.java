package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import setup.PropertyLoader;
import setup.WebDriverFactory;

public class BaseTest {

    protected static Logger log = Logger.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected String url;


    @BeforeSuite
    public void beforeSuite() {
        driver = getDriver();
        url = PropertyLoader.loadProperty("env.url");
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterSuite
    public void afterSuite() {
        driver.close();
    }

    protected static void testName(String testName) {
        log.info("\n=======================================================" +
                "=======================================" + "\n" + testName);
    }

    protected WebDriver getDriver() {
        if (driver == null) {
            driver = WebDriverFactory.getDriver();
        }
        return driver;
    }

    protected SoftAssert getSoftAssert() {
        if (softAssert == null) {
            softAssert = new SoftAssert();
        }
        return softAssert;
    }


}
