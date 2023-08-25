package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to launch the "IE" browser.
 */

public class LaunchIEBrowserTest {

	/**
	 * This method is for launching the "IE" browser.
	 */
	@Test
	public void launchIEBrowserTest()
	{
		WebDriverManager.iedriver().setup();
		WebDriver driver= new InternetExplorerDriver(); // Setup "IE" browser driver.
		driver.get("https://google.com"); // launching the "IE" browser.
	}
}
