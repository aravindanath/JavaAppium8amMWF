package day;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class MObileBrowser {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = null;



        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");

       // caps.setCapability("udid", "ZF62245RHC"); // Give Device ID of your mobile phone

        caps.setCapability("platformName", "Android");

        caps.setCapability("platformVersion", "12");

        caps.setCapability("browserName", "Chrome");

        caps.setCapability("newCommandTimeout", 0);

        caps.setCapability("chromedriverExecutable",

                "/Users/aravindanathdm/.appium/node_modules/appium-chromium-driver/node_modules/appium-chromedriver/chromedriver/mac/chromedriver-mac-arm64_v124.0.6367.201");

//        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/"), caps);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation jobs");

    }
}
