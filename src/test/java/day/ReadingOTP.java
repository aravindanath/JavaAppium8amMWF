package day;

import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReadingOTP extends AppLaunch {


    @Test
    public void readOTP() throws InterruptedException {
        Thread.sleep(3000);
        driver.openNotifications();
        driver.findElement(By.id("android:id/conversation_text")).click();

         String optmsg =  driver.findElement(By.xpath("(//*[@resource-id='com.google.android.apps.messaging:id/message_text'])[last()]")).getText();
       String otp =  Utils.getOtp(optmsg);
//       System.out.println("OTP: " + otp);

        driver.startActivity(new Activity("com.androidsample.generalstore","com.androidsample.generalstore.SplashActivity"));
        Thread.sleep(3000);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys(otp);


    }

}
