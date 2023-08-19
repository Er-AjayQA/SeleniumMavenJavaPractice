package synchronizationHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Ajay Kumar
 * Explicit wait is the wait for the element for some given condition.
 * Explicit wait can be given for any element in web page, can be used multiple time.
 * It has 0.5s of default polling time.
 */
public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userEmail = driver.findElement(By.id("identifierId"));
		wait.until(ExpectedConditions.elementToBeClickable(userEmail));
		userEmail.sendKeys("ak2681993@gmail.com");

	}

}
