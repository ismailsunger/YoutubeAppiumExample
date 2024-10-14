package pages;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Search YouTube\"]")
    public WebElement search;

    @FindBy(id = "com.google.android.youtube:id/search_edit_text")
    public WebElement searchInput;

    @FindBy(id = "com.google.android.youtube:id/search_type_icon")
    public List <WebElement> suggestions;

    @FindBy(id = "com.google.android.youtube:id/inline_player_overlay_container")
    public WebElement player;

    public SearchPage clickAllowButton()
    {
        clickElement(allowButton);
        return this;
    }

    public SearchPage clickSearchButton()
    {
        clickElement(search);
        return this;
    }
    public SearchPage clickSuggestionNthIndex(int index) throws InterruptedException {
        Thread.sleep(5000);
        clickElementByIndex(suggestions,index);
        return this;
    }

    public SearchPage sendSearchKey(String text)
    {
        setTextToElement(searchInput,text);
        return this;
    }

    public boolean isPlayerDisplayed()
    {
        return player.isDisplayed();
    }
}
