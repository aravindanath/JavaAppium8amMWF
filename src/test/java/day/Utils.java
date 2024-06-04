package day;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.Locale;

public class Utils {


    public static void scrollTOElement(AndroidDriver driver, String text) {

        String textPath = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"" + text + "\"));";
        driver.findElementByAndroidUIAutomator(textPath);
    }

    public static void scrollTOElementAndClick(AndroidDriver driver, String text) {

        String textPath = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"" + text + "\"));";
        driver.findElementByAndroidUIAutomator(textPath).click();
    }

    public static void longPress(AndroidDriver driver, WebElement element) {
        TouchActions actions = new TouchActions(driver);
        actions.longPress(element).build().perform();
    }

    public static void tap(AndroidDriver driver, WebElement element) {
        TouchActions actions = new TouchActions(driver);
        actions.singleTap(element).build().perform();
    }

    public static String firstname() {
        Faker fake = new Faker(new Locale("en-IND"));
        return fake.name().firstName();
    }

    public static String contact() {
        Faker fake = new Faker(new Locale("en-IND"));
        return fake.number().digits(11);

    }
}