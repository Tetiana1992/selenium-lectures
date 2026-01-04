package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseUsingTestNgAnnotation {




    @Test
    public void testCase001(){
        WebDriver driver = null;
        try {

            // Google search functionality
            // Pre-requisite: Chrome Browser should be open and maximized
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // 1. Go to google.com
            driver.get("https://www.google.com/");

            // 2. Type a search term (e.g.dragon)
            String expectedTerm = "winter";


            //chained version
            driver.findElement(By.name("q")).sendKeys(expectedTerm, Keys.ENTER);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains(expectedTerm));



            // 3. On the search result page, verify the title of the page has the same term


            String actualTitle = driver.getTitle();

//        if(actualTitle.contains(expectedTerm)){
//            System.out.println("PASS");
//        }else{
//            throw new AssertionError("Test failed. The actual title was: " + actualTitle + "The expected term: "+ expectedTerm);
//        }
            Assert.assertTrue(actualTitle.contains(expectedTerm));
            Assert.assertTrue(actualTitle.contains(expectedTerm));
        }finally{
            driver.quit();
        }




    }
}
