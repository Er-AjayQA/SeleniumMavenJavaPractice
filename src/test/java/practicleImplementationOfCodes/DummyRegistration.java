package practicleImplementationOfCodes;

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
 * This is dummy registration form given by "qa.way2automation.com" .
 * Filled this form by just providing the Name and Email.
 */
public class DummyRegistration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.name("name")).sendKeys("Ajay Kumar");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='submit' and @class='button'])[2]"))).click();
			

	}

}
