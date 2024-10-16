package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element)
    {
        element.click();
    }

    public void clickElementByIndex(List<WebElement> element, int index)
    {
        element.get(index).click();
    }

    public void setTextToElement(WebElement element, String text)
    {
        element.sendKeys(text);
    }
}
