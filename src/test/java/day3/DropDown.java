package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
    @Test
    public void testCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.carfax.com/");

        driver.findElement(By.linkText("Cars for Sale")).click();


        WebElement selectElement = driver.findElement(By.cssSelector("#undefined-make-input"));
        Select select = new Select(selectElement);
        //1 select.selectByVisibleText("Acura");

        //2  new Select(driver.findElement(By.cssSelector("#undefined-make-input"))).selectByValue("Acura");
        //3 new Select(driver.findElement(By.cssSelector("#undefined-make-input"))).selectByIndex(2);

    }
}
