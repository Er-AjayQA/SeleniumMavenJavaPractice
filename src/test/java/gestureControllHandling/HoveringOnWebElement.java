package gestureControllHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This is the example of "mouseHover" on any webElement.
 * This action can be performed using "Actions" class.
 */

public class HoveringOnWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");
		WebElement hoverElement= driver.findElement(By.xpath("//li[@class=' nS6XVS']/descendant::div[contains(.,'NEW CARS')]"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(hoverElement).perform(); // Hover mouse to element.
		

	}

}
