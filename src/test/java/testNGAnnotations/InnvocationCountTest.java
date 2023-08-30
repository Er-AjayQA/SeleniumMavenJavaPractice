package testNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains methods with different "InvocationCount" parameters.
 * By default priority will be "1" if not mentioned, it means at-least any method in class will executed once.
 * "InvocationCount" can be also used to disable the execution of any test method i.e. "InvocationCount= 0".
 */

public class InnvocationCountTest extends BaseClassUtility{

	public static WebDriver driver= null;
	
	/**
	 * This method will not get executed as "InvocationCount" value is "0".
	 */
	@Test(invocationCount = 0)
	public void openGoogleTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://google.com");
		System.out.println("Google opened.");
		driver.quit();
	}
	
	/**
	 * This method will get executed 2 times as "InvocationCount" value is "2".
	 */
	@Test(invocationCount = 2)
	public void openAmazonTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon opened.");
		driver.quit();
	}
	
	/**
	 * This method have by default "InvocationCount= 1", as it is not given.
	 */
	@Test
	public void openSeleniumTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://www.selenium.dev/");
		System.out.println("Selenium opened.");
		driver.quit();
	}
}
