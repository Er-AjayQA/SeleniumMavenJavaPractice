package windowsPopupsFrames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how we can open new window in new browser.
 * Also we can see here how we can bring driver control back to previous window.
 */
public class OpenNewWindowInNewBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String window= driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW); // Open new window in new browser.
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon");
		
		Thread.sleep(2000);
		driver.switchTo().window(window); // Bring the driver control to previous window.
		driver.findElement(By.id("name")).sendKeys("Ajay Kumar");

	}

}
