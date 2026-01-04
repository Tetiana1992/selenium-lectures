package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CssSelectorLocatorMechanism {
    @Test
    public void testCase() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.carfax.com/");
        driver.findElement(By.linkText("Used Car Values")).click();

        //Using class
        //div.text-input -> div with a class text input
        // .text-input -> any element with this class
        // .text-input.another-class -> elements with multiple classes

        List<WebElement> elements = driver.findElements(By.cssSelector("a.cgh__drop-menu-item"));
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("href"));

        }

        //Using id -> #someId

        driver.findElement(By.cssSelector("#used-tab"));

        //Using attribute
        // -> input[aria-label='License Plate Number']
        driver.findElements(By.cssSelector("input[aria-label='License Plate Number']"));

    }
}
