package browserOptionsHandling;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 *@author Ajay Kumar
 *This class contains methods that can opens the browsers in the given device options. 
 */

public class MobileViewTest {

	/**
	 * This method opens the browser in the given device options.
	 */
	@Test
	public void mobileViewTest()
	{
		Map<String, String> mobileEm= new HashMap<String, String>();
		mobileEm.put("deviceName", "iphone SE");
		ChromeOptions opt= new ChromeOptions();
		opt.setExperimentalOption("mobileEmulation", mobileEm);
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		
	}
}
