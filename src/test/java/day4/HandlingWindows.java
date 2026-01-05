package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class HandlingWindows {

    @Test
    public void testWindows() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.volvo.com/en/");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Cars']")).click();
        System.out.println("Before switching the window: " + driver.getTitle());
        //Switch to a window

        String firstWindowHandle = driver.getWindowHandle();//get the id of the currently active window
        System.out.println("First window's handle: " + firstWindowHandle);
        Set<String> windowHandles = driver.getWindowHandles();//gets the handles all open windows/tabs
        System.out.println("All window handles: " + windowHandles);

        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(firstWindowHandle)) {
                driver.switchTo().window(windowHandle);

            }
        }

        System.out.println("After switching the window: " + driver.getTitle());




        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Accept All']")).click();

        //Switch back to first
        driver.switchTo().window(firstWindowHandle);
        System.out.println("After switching back the original window: " + driver.getTitle());

        driver.close();// closes the current window/tab
        //driver.quit();//closes ALL windows




    }
}
