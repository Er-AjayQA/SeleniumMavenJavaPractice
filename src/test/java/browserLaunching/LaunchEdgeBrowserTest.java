package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to launch the "Edge" browser.
 */

public class LaunchEdgeBrowserTest {

	/**
	 * This method is for launching the "Edge" browser.
	 */
	@Test
	public void launchEdgeBrowserTest()
	{
		WebDriverManager.edgedriver().setup(); // Setup "Edge" browser driver.
		WebDriver driver= new EdgeDriver(); // launching the "Edge" browser.
		driver.get("https://google.com");
	}
}
