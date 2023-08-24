package windowsPopupsFrames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how we can open new window tab in same browser at runtime.
 */
public class OpenNewWindowTab {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		

	}

}
