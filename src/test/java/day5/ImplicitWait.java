package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {

    @Test
    public void testImplicit() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.instagram.com/");
        //Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("cdsvd");
        driver.findElement(By.name("password")).sendKeys("cdsvdfvrbhtggt", Keys.ENTER);

        //Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='xkmlbd1 xvs91rp xd4r4e8 x1anpbxc x11gldyt xyorhqc x11hdunq x2b8uid']"));
        Assert.assertTrue(errorMessage.isDisplayed());


    }
}
