package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathDemo2 {


    @Test
    public void test() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.webstaurantstore.com/");

        //System.out.println(driver.findElement(By.xpath("//button[@type='submit'][@value='Search']")).click()));

        //using multiple attributes
        //button[@type='submit'][@value='Search']
        //button[@type='submit' and @value='Search']

        //using attribute names only

        //button[@type] -> all button elements with type attribute

        //*[@id] -> any element with an id attribute

        //*[@*] -> any element with any attribute

        //* -> any element

        //text based match

        //div[.='Fully Vitrified Dinnerware'] -> div with a text 'Fully Vitrified Dinnerware'
        //div[text()='Fully Vitrified Dinnerware'] -> div with a text 'Fully Vitrified Dinnerware'

        //div[contains(text(), 'Minimal')]

        System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Minimal')]")));

        //Predicate
        //(xpathExpression)[Number]
        //  (//div[@class='somevalue'])[2] -> matches the second of the possible matches

        System.out.println(driver.findElement(By.xpath("")));







        //NoSuchElementException
        //1. Wrong Locator
        //2. timing
        //3. the element is inside an inframe
    }
}
