package day;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utils {


    public static void scrollTOElement(AndroidDriver driver, String text){

        String textPath = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(textPath);
    }

    public static void scrollTOElementAndClick(AndroidDriver driver, String text){

        String textPath = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(textPath).click();
    }

}
