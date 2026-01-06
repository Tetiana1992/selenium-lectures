package day5;

import day3.SeleniumUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSExecutorDemo {

    @Test
    public void testJSExecutor() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

//            driver.get("https://www.amazon.com/");
//            Thread.sleep(2000);
//
//           // driver.findElement(By.xpath("//span[.='Prime Membership']")).click();
//            //ElementNotInteractableException: element not interactable
//
//        //JavascriptExecutor js = (JavascriptExecutor)driver;
//        WebElement link = driver.findElement(By.xpath("//span[.='Prime Membership']"));
//        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", link );
//        SeleniumUtils.jsClick(driver, link);

        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("hello", Keys.ENTER);
        Thread.sleep(1000);
        //First way
        for (int i = 0; i < 7; i++) {
            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");
            Thread.sleep(1000);

        }
        //Second way

        ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");
        Thread.sleep(1000);

        ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

    }
}
