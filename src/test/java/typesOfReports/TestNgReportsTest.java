package typesOfReports;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains method that demonstrate how "TestNG" helps to generate reports.
 * This is by default report generated by teestNG. 
 */

public class TestNgReportsTest extends BaseClassUtility{

	public static WebDriver driver= null;
	
	@Test
	public void checkTestNgReportTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://google.com");
		Reporter.log("Google Opened Successfully.");
		driver.quit();
	}
}
