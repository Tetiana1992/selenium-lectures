package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class TestCase {

    public static void main(String[] args) {
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
            // Locate the search bar
            WebElement searchBar = driver.findElement(By.name("q"));
            // Type the term and hit enter
            searchBar.sendKeys(expectedTerm, Keys.ENTER);

            //chained version
             driver.findElement(By.name("q")).sendKeys(expectedTerm, Keys.ENTER);




            // 3. On the search result page, verify the title of the page has the same term
            String expectedTitle = expectedTerm;

            String actualTitle = driver.getTitle();

//        if(actualTitle.contains(expectedTerm)){
//            System.out.println("PASS");
//        }else{
//            throw new AssertionError("Test failed. The actual title was: " + actualTitle + "The expected term: "+ expectedTerm);
//        }
            Assert.assertEquals(actualTitle, expectedTitle);
            Assert.assertTrue(actualTitle.contains(expectedTerm));
        }finally{
            driver.quit();
        }




    }
}
