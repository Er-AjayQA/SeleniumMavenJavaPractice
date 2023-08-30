package testNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains methods with different "Priority" parameters.
 * We can give "-ve" value as priority.
 * By default priority will be "0" if not mentioned.
 */

public class PriorityTest extends BaseClassUtility{
	public static WebDriver driver= null;
	
	/**
	 * This method opens "Google" in browser.
	 */
	@Test(priority = 3)
	public void openGoogleTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://google.com");
		System.out.println("Google opened.");
	}
	
	@Test(priority = 1)
	public void openAmazonTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon opened.");
	}
	
	@Test(priority = 2)
	public void openFlipkartTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://www.amazon.in/");
		System.out.println("Flipkart opened.");
	}
	
	/**
	 * This method have default priority i.e. "0".
	 */
	@Test
	public void openSeleniumTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://www.selenium.dev/");
		System.out.println("Selenium opened.");
	}

}
