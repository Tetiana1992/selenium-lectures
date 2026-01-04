package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandingCheckBoxes {
    @Test
    public void testCase() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.carfax.com/");

        driver.findElement(By.linkText("Used Car Values")).click();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[type='checkbox']")).click();


        WebElement checkBox = driver.findElement(By.cssSelector(".checkbox-input_box"));
        if(!checkBox.isSelected()){
            checkBox.click();
        }




        //ElementClickInterceptedException: happens when an element is covered by another element
        //One way to fix it is to click on the other element that is covering it
        //Another way is to use Javascript click


    }
}
