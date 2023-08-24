package windowsPopupsFrames;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how we can handle the windows.
 */

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String window: windows)
		{
			driver.switchTo().window(window);
			String winTitle= driver.getTitle();
			if(winTitle.contains("Basic Controls"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(.,'Contact')]")).click();

	}

}
