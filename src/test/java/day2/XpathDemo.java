package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathDemo {

    //Xpath -> XMLPath -> query language used to locate elements from XML/HTML document
    //absolute xpath -> /html/body/div[2]/div/div/div[2]/div/div[2]/main/div/div/div/div/div[1]/div/div/div[1]
    // relative Xpath -> //div[@class='_446kkh']

    @Test
    public void test() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.hoteltonight.com/");

//        String absoluteXpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/main/div/div/div/div/div[1]/div/div/div[1]";
//        System.out.println(driver.findElement(By.xpath(absoluteXpath)).getText());

        //Thread.sleep(1000); static wait

        String relativeXpath = "//div[@class='_446kkh']";
        System.out.println(driver.findElement(By.xpath(relativeXpath)).getText());

        //wss zest-ui-button blue primary large hidden lt:flex rounded-none rounded-r py-2.5 px-4-1/2 tracking-[.02em]

        //NoSuchElementException
        //1. Wrong Locator
        //2. timing
        //3. the element is inside an inframe
    }
}
