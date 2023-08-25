package browserLaunching;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;

/**
 * @author Ajay Kumar
 * This class contains method i.e. responsible to to fetch browser value from property file and launch that browser.
 */

public class LaunchBrowserThroughPropertyFileTest extends BaseClassUtility{

	
	/**
	 * This method is responsible for launching browser by fetching browser value from property file.
	 * @throws IOException
	 */
	@Test
	public void launchBrowserThroughPropertyFileTest() throws IOException
	{
		String browserValue= pUtil.fetchPropertyFileData("Browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browserValue.equalsIgnoreCase("ie"))
		{
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println("<--Invalid Browser Value-->");
		}
		
		driver.get("https://google.com");
	}
}
