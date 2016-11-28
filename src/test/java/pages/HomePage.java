package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/ru/']")
    public WebElement rusLangButton;
    @FindBy(xpath = "//a[@href='/lv/']")
    public WebElement lvLangButton;
    @FindBy(xpath = "//a[contains(text(),'Elektrotehnika')]")
    public WebElement elektrotehnika;


}
