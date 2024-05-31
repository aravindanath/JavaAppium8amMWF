package day;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

//Assignment: Click on one on-screen country, Enter name, click 'Let's Shop'.

public class TC_02 extends  AppLaunch{

    @Test
    public void test(){

        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Algeria\"]")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Test Name");
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        //
        ////android.widget.Toast[@text="Please enter your name"]
    }

}
