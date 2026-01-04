package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WaitDemo {

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = null;
        try {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.instagram.com/");

            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("invalidUser");
            driver.findElement(By.name("password")).sendKeys("invalidPassword");
            driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).click();
        } finally {
            driver.quit();
        }
    }
}
