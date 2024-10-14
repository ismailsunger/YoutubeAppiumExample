package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.SearchPage;

public class AndroidTest extends BaseTest {

    @Test
    public void test() throws InterruptedException{

        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAllowButton()
                .clickSearchButton()
                .sendSearchKey("appium")
                .clickSuggestionNthIndex(2);

        Assert.assertTrue(searchPage.isPlayerDisplayed());
    }
}
