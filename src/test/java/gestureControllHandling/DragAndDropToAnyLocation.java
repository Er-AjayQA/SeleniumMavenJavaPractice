package gestureControllHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This is the example of "Action" class for "Drag and Drop".
 * Drag the source element to any x-axis and y-axis location.
 */

public class DragAndDropToAnyLocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable= driver.findElement(By.id("draggable"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(draggable, 500, 300).perform();

	}

}
