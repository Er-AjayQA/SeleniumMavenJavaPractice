package testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains method that shows how we can utilize the "TakingScreenShot" methods. 
 */

public class TakingScreenShotsTest extends WebDriverUtility{

	@Test
	public void takingScreenShotTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String screenShotPath= takeScreenShot(driver, "google");
		System.out.println(screenShotPath);
		driver.quit();
	}
}
