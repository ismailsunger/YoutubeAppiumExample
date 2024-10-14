package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AppiumDriver driver;

    @Before
    public void setDriver() throws MalformedURLException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("appium:deviceName", "Emulator");
        androidCaps.setCapability("appium:automationName", "UIAutomator2");
        androidCaps.setCapability("appium:udid", "emulator-5554"); //DeviceId from "adb devices" command
        androidCaps.setCapability("appium:platformName", "Android");
        androidCaps.setCapability("appium:platformVersion", "13.0");
        androidCaps.setCapability("appium:skipUnlock", "true");
        androidCaps.setCapability("appium:appPackage", "com.google.android.youtube");
        androidCaps.setCapability("appium:appActivity", "HomeActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidCaps);
    }

}
