package day;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_01 extends  AppLaunch{

    @Test
    public void test(){
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
    }
}
