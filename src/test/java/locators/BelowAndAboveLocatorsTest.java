package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This is an example of "Above and Below" relative locators.
 */

public class BelowAndAboveLocatorsTest{

	@Test
	public void belowAboveLocatorTest()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		WebElement email = driver.findElement(RelativeLocator.with(By.xpath("//input[@name='email']")).above(By.xpath("//select[@name='country']")));
		email.sendKeys("abc@gmail.com");
		
		WebElement city= driver.findElement(RelativeLocator.with(By.xpath("//input[@name='city']")).below(By.xpath("//select[@name='country']")));
		city.sendKeys("New Delhi");
	}
}
