package activities;// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static <WebElement> void main(String[] args) throws InterruptedException {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.linkText("Jobs")).click();
        System.out.println("Jobs page title: " + driver.getTitle());
        Thread.sleep(2000);
        WebElement keywords = (WebElement) (WebElement) (WebElement) driver.findElement(By.xpath("//input[starts-with(@type, 'text')]"));
        ((org.openqa.selenium.WebElement) keywords).sendKeys("banking");
        driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]")).click();
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        String EmailId=driver.findElement(By.xpath("//p[contains(text(),'To apply for this job')]/a")).getText();
        System.out.println("Emailid to apply job is "+EmailId);
        // Close the browser
        driver.close();
    }
}