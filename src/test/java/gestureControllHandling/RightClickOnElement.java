package gestureControllHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

/** @author Ajay Kumar
* This example shows how to right click on any webElement.
* This action can be performed using "Actions" class.
*/
public class RightClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement element= driver.findElement(By.xpath("//img[contains(@src,'popup')]"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);		
		act.contextClick(element).perform(); // Mouse right click.

	}

}
