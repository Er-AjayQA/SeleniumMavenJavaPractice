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

public class LaunchChromeBrowser {

	@Test
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");

	}

}
