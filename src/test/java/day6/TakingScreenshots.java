package day6;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakingScreenshots {

    @Test
    public void screenshots() throws InterruptedException, IOException {
        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

            driver.get("https://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
            driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test123", Keys.ENTER);
            driver.findElement(By.linkText("Order"));
        }catch(Exception e){

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("src/test/java/day6/screenshot."+System.currentTimeMillis()+"png"));

        }finally{
            driver.quit();
        }


    }
}