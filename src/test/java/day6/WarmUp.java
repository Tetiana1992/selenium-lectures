package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class WarmUp {
    @Test
    public void warmUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.dice.com/");



        driver.findElement(By.id("typeaheadInput")).sendKeys("SDET");
        driver.findElement(By.id("IPGeoLocateButton")).click();
        driver.findElement(By.id("submitSearch-button")).click();



    }
}
