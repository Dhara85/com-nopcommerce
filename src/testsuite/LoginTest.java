package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Get baseUrl
        driver.get(baseUrl);
        //To maximize window
        driver.manage().window().maximize();
        // To implement implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click on Log in page
        driver.findElement(By.linkText("Log in")).click();
        // refresh the page
        driver.navigate().refresh();
        //Enter Email ID field
        driver.findElement(By.id("Email")).sendKeys("dhara456@gmail.com");
        // Enter Password field
        driver.findElement(By.name("Password")).sendKeys("Dhara123");
        //click on login button
        Thread.sleep(3000);
        driver.findElement(By.linkText("Log in")).click();
        // close the driver
        driver.quit();
    }
}
