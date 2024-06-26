package day;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AppLaunch {
   protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws  MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability("platformName", "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
//        caps.setCapability(MobileCapabilityType.UDID,"59ff3a5f");
         driver = new AndroidDriver (new URL("http://127.0.0.1:4723/"),caps);
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    



    }
}
