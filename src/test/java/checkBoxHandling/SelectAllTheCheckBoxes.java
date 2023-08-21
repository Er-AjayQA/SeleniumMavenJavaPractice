package checkBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to select all the "checkBoxes".
 */

public class SelectAllTheCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='display'][1]/descendant::input[@type='checkbox']"));
		for(WebElement checkbox: checkboxes)
		{
			checkbox.click();
		}


	}

}
