package thyroCare;

import day.Utils;
import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookATest extends ThyroAppLaunch{

    String name = Utils.firstname();
    String cont = Utils.contact();

    @Test

    public void bookTest()
    {
        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Home | Thyrocare\"]/android.view.View/android.view.View[1]/android.widget.Button[1]")).click();
        driver.findElement(By.xpath("//android.view.View[@text=\"Book a test\"]")).click();
String test = driver.findElement(By.xpath("//android.widget.TextView[@text=\"AAROGYAM 1.1 WITH UTSH\"]")).getText();

if (test.equalsIgnoreCase("aarogyam 1.1 with utsh"))
{
    driver.findElement(By.xpath("(//android.widget.Button[@text=\"Book\"])[1]")).click();
    driver.findElement(By.xpath("//android.app.Dialog[@text=\"Request Callback\"]/android.view.View/android.widget.EditText[1]")).sendKeys(name);
    driver.findElement(By.xpath("//android.app.Dialog[@text=\"Request Callback\"]/android.view.View/android.widget.EditText[2]")).sendKeys(cont);
}

    }
}
