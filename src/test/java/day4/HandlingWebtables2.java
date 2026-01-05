package day4;

import day3.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class HandlingWebtables2 {

    @Test
    public void testWebtables() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("http://www.livecoinwatch.com/");
        int columns = driver.findElements(By.xpath("//caption[.='Live Crypto Prices']/parent::table//thead//tr//th")).size();
        int rows = driver.findElements(By.xpath("//caption[.='Live Crypto Prices']/parent::table//tbody//tr[@class='table-row filter-row']")).size();

        //ITERATE THROUGH THE TABLE CONTENT

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= columns ; j++) {

                String xpath ="//caption[.='Live Crypto Prices']/parent::table//tbody//tr[@class='table-row filter-row'][" + i + "]//td[" + j + "]";

                String eachCellsText = driver.findElement(By.xpath(xpath)).getText().trim();

                System.out.print(eachCellsText + "\t");

            }
            System.out.println();


        }




    }
}
