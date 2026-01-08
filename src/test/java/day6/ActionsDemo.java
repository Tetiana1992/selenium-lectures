package day6;

import day3.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsDemo {
    @Test
    public void testAction() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");


        WebElement searchBar = driver.findElement(By.id("typeaheadInput"));
        SeleniumUtils.scrollToBy(driver,0, 500);
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(searchBar, "sdet").keyUp(Keys.SHIFT).sendKeys(searchBar, " qa").build().perform();
        actions.keyDown(Keys.LEFT_SHIFT).click(driver.findElement(By.linkText("Project Manager"))).perform();
    }
}
