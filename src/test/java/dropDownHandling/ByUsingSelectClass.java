package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to select options from dropDown.
 * "Select" class is used if the dropDown is created by using <Select> HTML tag.
 */

public class ByUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		WebElement options = driver.findElement(By.name("selectionField"));
		
		// Code for select options.
		Select sel= new Select(options); // Create object for the "Select" class.
		sel.selectByIndex(1); // Select options by "Index".
		Thread.sleep(5000);
		sel.selectByValue("CN"); // Select options by "value".
		Thread.sleep(2000);
		sel.selectByVisibleText("California -- CA "); //Select options by "VisibleText".

	}

}
