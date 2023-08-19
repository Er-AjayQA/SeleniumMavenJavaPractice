package synchronizationHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * Implicit wait will wait for the webElement to be appeared within the given time.
 * If element appeared before the time given then it continue the further execution of code.
 */
public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://gmail.com");
		WebElement userEmail = driver.findElement(By.id("identifierId"));
		userEmail.sendKeys("ak2681993@gmail.com");

	}

}
