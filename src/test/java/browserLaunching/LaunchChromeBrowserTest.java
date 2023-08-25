/**
 * @author Ajay Kumar
 * The class in this package is used to launch Chrome browser.
 */

package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to launch the "Chrome" browser.
 */

public class LaunchChromeBrowserTest {

	/**
	 * This method is for launching the "Chrome" browser.
	 */
	@Test
	public void launchChromeBrowserTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); // Setup "Chrome" browser driver.
		driver.get("https://google.com"); // launching the "Chrome" browser.

	}

}
