package activities;// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());


        WebElement username = (WebElement) (WebElement) (WebElement) driver.findElement(By.xpath("//input[starts-with(@id, 'user_')]"));
        ((org.openqa.selenium.WebElement) username).sendKeys("root");
        WebElement password = (WebElement) (WebElement) (WebElement) driver.findElement(By.xpath("//input[starts-with(@id, 'user_pass')]"));
        ((org.openqa.selenium.WebElement) password).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();


        // Close the browser
        driver.quit();
    }
}