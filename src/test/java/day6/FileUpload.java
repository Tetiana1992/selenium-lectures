package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class FileUpload {
    @Test
    public void testFileUpload() throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait is dynamic wait provided by Selenium

        driver.get("https://www.file.io/");

        //String pathToCurrentFolder = System.getProperty("user.dir");
        //System.out.println(pathToCurrentFolder);
        //Locate the input element with type attribute file and sendKeys the path to the file
        driver.findElement(By.id("Upload Files")).sendKeys("\"C:\\Users\\lisi4\\OneDrive\\Desktop\\QA tester\\6.14.25Homework.docx\"");
        //driver.findElement(By.xpath("//input[@id='select-files-input']")).sendKeys(System.getProperty("user.dir") + "src/test/java/day6/screenshot.png");
        //System.out.println(System.getProperty("user.dir") + "src/test/java/day6/screenshot.png");

        Robot robot = new Robot();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setExperimentalOption();


    }
}
