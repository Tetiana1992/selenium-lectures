package day5;

import day3.SeleniumUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scroll {

    @Test
    public void testJSExecutor() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.duotech.io/");
        WebElement webElement = driver.findElement(By.xpath("//a[].='Enroll Now'"));
        int verticalLocation = webElement.getLocation().getY();
        System.out.println(verticalLocation);
        ((JavascriptExecutor)driver).executeScript("window.scroll(0,"+verticalLocation+")");

        SeleniumUtils.scrollToWebElement(driver, driver.findElement(By.xpath("//a[].='Learn More'")));


    }
}
