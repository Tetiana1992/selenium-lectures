package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetAttributeMethod {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.webstaurantstore.com/");
        WebElement searchBox = driver.findElement(By.id("searchval"));
        System.out.println(searchBox.getAttribute("aria-label"));
        String expected = "What are you looking for? Type a search term, and navigate through results with up and down arrows.";
        String actual = searchBox.getAttribute("aria-label");
        Assert.assertEquals(actual, expected);

        String term = "table";
        driver.findElement(By.id("searchval")).sendKeys(term, Keys.ENTER);
        String actualQuantity = driver.findElement(By.xpath("//input[@name='qty']")).getAttribute("value");
        Assert.assertEquals(actualQuantity, "1");

        //to get the text from any input box use get Attribute("value")
        System.out.println(driver.findElement(By.id("searchval")).getAttribute("value"));
        
        //Find all links on the page and print their URLs

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));

        }


    }
}
