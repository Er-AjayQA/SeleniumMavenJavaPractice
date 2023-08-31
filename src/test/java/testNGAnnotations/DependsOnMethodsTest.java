package testNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contains methods with different "dependsOnMethods" parameters.
 * Here dependent methods will get executed if the independent methods on which they are dependent, will get passed.
 */

public class DependsOnMethodsTest extends BaseClassUtility{

	public static WebDriver driver= null;
	
	@Test
	public void openGoogleTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://google.com");
		System.out.println("Google opened.");
		String expected= "GoogleOpen";
		SoftAssert sAssert= new SoftAssert();
		sAssert.assertEquals(driver.getTitle(), expected);
		driver.quit();
		sAssert.assertAll();
	}
	
	/**
	 * This method depends upon both "openGoogleTest".
	 * Here "openGoogleTest" method should passed then only this method will executed.
	 * As "openGoogleTest" method will get failed so this method will get skipped.
	 */
	@Test(dependsOnMethods = "openGoogleTest")
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
	 * This method depends upon both "openGoogleTest","openAmazonTest".
	 * Here both method should passed then only this method will executed.
	 * As "openGoogleTest" method will get failed so this method will get skipped.
	 */
	@Test(dependsOnMethods = {"openGoogleTest","openAmazonTest"})
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
