package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicAttributes {
    @Test
    public void testCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        //To work with dynamic elements, we need to see an attribute value that stays static and use the corresponding method

        //XPATH:
        //input[starts-with(@name,'name')]
        //input[ends-with(@id,'username')]
        //input[contains(@id,'password')]

        // CSS:
        // starts-with -> input[name^='name']
        // ends-with -> input[name$='name']
        // contains -> input[name*='name']

        driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("John Doe");





    }
}
