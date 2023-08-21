package gestureControllHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This is the example for resizing any resizable element using "Actions" class with "dragandDropBy" method.
 */

public class ResizeByDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement draggable= driver.findElement(By.xpath("//div[@id='resizable']/descendant::div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDropBy(draggable, 300, 300).perform();

	}

}
