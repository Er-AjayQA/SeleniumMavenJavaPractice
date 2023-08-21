package checkBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to select checkBox by it's position.
 */

public class SelectByPosition {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		// Select by "index".
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='display'][1]/descendant::input[@type='checkbox'][last()-2]"));
		checkbox1.click();


	}

}
