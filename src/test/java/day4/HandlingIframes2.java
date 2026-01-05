package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingIframes2 {


    @Test
    public void testIframes2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.duotech.io/enroll-sqae2");

        driver.switchTo().frame(driver.findElement(By.xpath("exactly iframe path")));
        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Tetiana");

        //Interact again with the amin window
        //Switch the context to the main window
        driver.switchTo().defaultContent();
        WebElement contactsLink = driver.findElement(By.linkText("Contacts"));

        //Using JS you can click on anything that throws ElementClickInterceptedException or ElementNotInterceptedException

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", contactsLink );



    }
}
