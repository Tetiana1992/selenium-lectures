package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WarmUpTask {

    @Test
    public void testWarmUp() throws InterruptedException {
        WebDriver driver = null;

        try {

            driver = new ChromeDriver();
           // driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

            //End-to-end test

            driver.get("https://www.hoteltonight.com/");

            driver.findElement(By.xpath("//div[@class='_u5qvqfo']//div[.='Tonight']")).click();
        }finally{


        }

    }
}
