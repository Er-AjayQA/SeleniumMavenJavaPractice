package checkBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to check/select a single "checkBox".
 */

public class SelectSingleCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		// Select By attribute "Value".
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='display'][1]/descendant::input[@value='soccer']"));
		if(checkbox.isSelected()== false)
		{
			checkbox.click();
			System.out.println("Successfully selected.");
		}
		else
		{
			System.out.println("Option is already selected.");
		}		

	}

}
