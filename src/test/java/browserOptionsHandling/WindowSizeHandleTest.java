package browserOptionsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 *@author Ajay Kumar
 *This class contains methods for browser to handle the "Window-Size. 
 */

public class WindowSizeHandleTest {

	/**
	 * This method opens the browser with the given size.
	 */
	@Test
	public void browserWindowSizeHandlingTest()
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("window-size=500,500");
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://google.com");
		
	}
}
