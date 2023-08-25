package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to launch the "Firefox" browser.
 */

public class LaunchFireFoxBrowserTest {

	@Test
	public void launchFireFoxBrowserTest()
	{
		WebDriverManager.firefoxdriver().setup(); // Setup firefox browser driver.
		WebDriver driver= new FirefoxDriver(); // launching the firefox browser.
		driver.get("https://google.com");
	}
}
