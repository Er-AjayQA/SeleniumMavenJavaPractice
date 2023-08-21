package dropDownHandling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to select options from dropDown by using "sendKeys" method.
 * Remember that "sendKeys" is not 100% accurate in case of dropDown.
 */

public class ByUsingSendKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wikipedia.org/");
		WebElement options = driver.findElement(By.id("searchLanguage"));
		
		// Code for select options.
		options.sendKeys("Български");

	}

}
