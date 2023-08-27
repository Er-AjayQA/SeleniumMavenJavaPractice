package browserOptionsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *@author Ajay Kumar
 *This class contains methods for all browser to open in "Headless Mode". 
 */

public class BrowserHeadlessTest {

	/**
	 * This method opens the "Chrome" browser in "Headless Mode".
	 */
	@Test
	public void chromeBrowserHeadlessTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://google.com");
		
	}
	
	/**
	 * This method opens the "FireFox" browser in "Headless Mode".
	 */
	@Test
	public void firefoxBrowserHeadlessTest()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--headless");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	/**
	 * This method opens the "Edge" browser in "Headless Mode".
	 */
	@Test
	public void edgeBrowserHeadlessTest()
	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt= new EdgeOptions();
		opt.addArguments("--headless");
		WebDriver driver= new EdgeDriver(opt);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
}
