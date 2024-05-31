package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TC_03 extends  AppLaunch{

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        Utils.scrollTOElementAndClick(driver, "Bhutan");
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arvind");
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        List<WebElement> addCart =driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart"));

        for(WebElement ele : addCart){
            ele.click();
        }

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();


        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

        Thread.sleep(2000);
      Set<String> views =   driver.getContextHandles();

      for(String view : views){
          System.out.println(view);
      }

      driver.context("");



    }
}
