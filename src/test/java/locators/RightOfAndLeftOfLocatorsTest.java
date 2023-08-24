package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This example shows how can we use "toRightOf()" relative locator.
 */
public class RightOfAndLeftOfLocatorsTest {

	@Test
	public void rightOfAndLeftOfLocatorsTest()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		WebElement userName= driver.findElement(RelativeLocator.with(By.xpath("//input[@name='username']")).toRightOf(By.xpath("//label[contains(.,'Username:')]")));
		userName.sendKeys("AjayCloud");
		
//		WebElement passWord= driver.findElement(RelativeLocator.with(By.xpath("//label")).toLeftOf(By.xpath("//input[@name='password']")));
//		System.out.println(passWord.getText());
		
		
	}
}
