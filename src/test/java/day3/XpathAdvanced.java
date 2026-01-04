package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathAdvanced {
    @Test
    public void testCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.carfax.com/");

        driver.findElement(By.linkText("Used Car Values")).click();

        //Locate all a's with class attributes
        //a[@class]

        //a[not(@class)] -> all a's that do NOT have a class attribute

        // Advanced locating strategies based on child, parent, siblings

        //Locate a non-unique element by locating its unique PARENT
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='form-element_input']")).sendKeys("19006");


        //syntax -> childLocator/parent::tagName
        //h2[ contains (text(), 'Step 2 - Enter your VIN')]//parent::form

        driver.findElement(By.xpath("//div[@class='form-element_input']")).getText();

        //Locate a non-unique element by its unique SIBLING that comes after it





    }
}
