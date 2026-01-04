package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingByClass {

    // There are 8 locators in Selenium:
    // id, name, className, tagName, linkText, partialLinkText, xpath, cssSelector


    @Test
    public void test1(){
        WebDriver driver = null;
        try {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("dragon", Keys.ENTER);
            //classname are normally not unique, this method is usually used to locate all elements that match the criteria
            // findElement method returns the first element that matches the criteria
            System.out.println(driver.findElement(By.className("yuRUbf")).getText());

            List<WebElement> divs = driver.findElements(By.className("yuRUbf"));
            for (WebElement div : divs) {
                System.out.println(div);



            }


        }finally{
            driver.quit();
        }
    }
}
