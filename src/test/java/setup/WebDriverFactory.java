package setup;

import drivers.ChromeWebDriver;
import drivers.FireFoxWebDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    public static WebDriver getDriver() {
        switch (PropertyLoader.loadProperty("browser.name")) {
            case "firefox":
                return FireFoxWebDriver.getInstance();
            case "chrome":
                return ChromeWebDriver.getInstance();
        }
        return null;
    }
}
