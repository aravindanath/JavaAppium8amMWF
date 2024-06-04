package thyroCare;

import day.Utils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RequestCallBack extends ThyroAppLaunch {

    String name = Utils.firstname();
    String phone = Utils.contact();

    @Test
    public void CallBackRequest() {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"Request Callback\"]")).click();
        driver.findElement(By.xpath("//android.app.Dialog[@text=\"Request Callback\"]/android.view.View/android.widget.EditText[1]")).sendKeys(name);
        driver.findElement(By.xpath("//android.app.Dialog[@text=\"Request Callback\"]/android.view.View/android.widget.EditText[2]")).sendKeys(phone);
        driver.findElement(By.xpath("//android.widget.Button[@text=\"PROCEED\"]")).click();


    }
}
