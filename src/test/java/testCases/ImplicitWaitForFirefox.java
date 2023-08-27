package practicleImplementationOfCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitForFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userEmail = driver.findElement(By.id("identifierId"));
		userEmail.sendKeys("ak2681993@gmail.com");

	}

}
