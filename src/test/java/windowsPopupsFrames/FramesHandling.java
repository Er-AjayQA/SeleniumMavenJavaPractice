package windowsPopupsFrames;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to switch to "frames".
 * Here we can see how to handle frames.
 */

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no. of frames--> "+frames.size()); // Get total number of frames in a page.
		for(WebElement frame: frames)
		{
			System.out.println(frame.getAttribute("id")); // Get "Id's" of all page.
		}
		driver.switchTo().frame("iframeResult"); // Switch to frame by "id".
		Thread.sleep(2000);
		driver.switchTo().frame(0); // Switch to frame by "index".
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("navbtn_menu"))).click();
		System.out.println("Clicked on menu button");

	}

}
