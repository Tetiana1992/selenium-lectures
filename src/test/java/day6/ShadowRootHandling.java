package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowRootHandling {

    @Test
    public void testShadow() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");
        Thread.sleep(4000);
        //Locate the main element that contains the shadow root element

        WebElement topElement = driver.findElement(By.cssSelector("dhi-seds-nav-header"));
        SearchContext shadowRoot1 = topElement.getShadowRoot();
        //Obtain the second shadow root
        //to find an element inside a shadow root, use cssSelector() locator method, xpath or any other locators do not work
        SearchContext shadowRoot2 = shadowRoot1.findElement(By.cssSelector("dhi-seds-nav-header-technologist.hydrated")).getShadowRoot();
        SearchContext shadowRoot3 = shadowRoot2.findElement(By.cssSelector("dhi-seds-nav-header-display")).getShadowRoot();
        shadowRoot3.findElement(By.linkText("Why Dice")).click();
        //driver.findElement(By.linkText("Why Dice")).click();

    }
}
