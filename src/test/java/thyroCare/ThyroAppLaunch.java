package thyroCare;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ThyroAppLaunch {

    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability("platformName", "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"OnePlus 7T");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.illionsoft.thyrocare.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.illionsoft.thyrocare");
//        caps.setCapability(MobileCapabilityType.UDID,"59ff3a5f");
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




    }
}

