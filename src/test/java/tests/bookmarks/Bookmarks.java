package tests.bookmarks;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Bookmarks extends BaseTest {

    HomePage homePage = new HomePage(getDriver());

    @Test
    public void checkIfSelectedItemsAreDisplayedInBookmarks() {
        log.info("bookmarks: The purpose of test is to verify if selected items are displayed on bookmarks tab");
        homePage.rusLangButton.click();
        //... to be continued
    }
    @Test
    public void checkUrl(){
        Assert.assertEquals("https://www.ss.lv/",driver.getCurrentUrl());
    }
}
