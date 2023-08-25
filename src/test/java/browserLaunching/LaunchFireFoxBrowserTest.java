package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to launch the "FireFox" browser.
 */

public class LaunchFireFoxBrowserTest {

	/**
	 * This method is for launching the "FireFox" browser.
	 */
	@Test
	public void launchFireFoxBrowserTest()
	{
		WebDriverManager.firefoxdriver().setup(); // Setup "FireFox" browser driver.
		WebDriver driver= new FirefoxDriver(); // launching the "FireFox" browser.
		driver.get("https://google.com");
	}
}
