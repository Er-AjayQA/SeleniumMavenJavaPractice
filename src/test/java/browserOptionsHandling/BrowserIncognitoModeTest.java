package browserOptionsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *@author Ajay Kumar
 *This class contains methods for all browsers to open in "Incognito Mode". 
 */

public class BrowserIncognitoModeTest {

	/**
	 * This method opens the "Chrome" browser in "Incognito Mode".
	 */
	@Test
	public void chromeBrowserIncognitoModeTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://google.com");		
	}
	
	/**
	 * This method opens the "FireFox" browser in "Incognito Mode".
	 */
	@Test
	public void firefoxBrowserHeadlessModeTest()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--private");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	/**
	 * This method opens the "Edge" browser in "Incognito Mode".
	 */
	@Test
	public void edgeBrowserHeadlessModeTest()
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt= new EdgeOptions();
		opt.addArguments("--inPrivate");
		WebDriver driver= new EdgeDriver(opt);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
}
