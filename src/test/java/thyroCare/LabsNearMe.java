package thyroCare;

import day.Utils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LabsNearMe extends ThyroAppLaunch{

    @Test

    public void labsNearby()
    {
        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Home | Thyrocare\"]/android.view.View/android.view.View[1]/android.widget.Button[1]")).click();
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Labs Near Me\"]")).click();
        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Thyrocare | Diagnostic & Preventive Health Care Industry in India\"]/android.view.View/android.view.View[3]/android.widget.EditText")).sendKeys("110075");
        driver.findElement(By.xpath("//android.view.View[@text=\"Select City\"]")).click();
        Utils.scrollTOElement(driver, "Delhi");
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Delhi\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"VIEW DETAILS\"]")).click();


    }
}
