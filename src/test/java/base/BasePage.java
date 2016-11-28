package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
/*public class SuperPage {
    public static FirefoxDriver driver;

    public SuperPage(FirefoxDriver driver) {
        this.driver = driver;
        PageFactory.initElements(SuperPage.driver, this);
    }
}*/