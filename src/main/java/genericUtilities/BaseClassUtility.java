package genericUtilities;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * BaseClassUtility is responsible for making the code generic.
 * No need to perform basic tasks like launching browser, and loading Url again and again.
 */

public class BaseClassUtility {

	public ExcelFileUtility eUtil= new ExcelFileUtility();
	public PropertyFileUtility pUtil= new PropertyFileUtility();
	public WebDriverUtility wUtil= new WebDriverUtility();
	public JavaUtility jUtil= new JavaUtility();
	
	public WebDriver driver= null;
	
	
	/**
	 * This method execute before all the class present inside the testSuite.
	 * Before execution of class it automatically launch the desired browser and also load the baseUrl.
	 * @throws IOException
	 */
	public void beforeClassConfig() throws IOException
	{
		String browser= pUtil.fetchPropertyFileData("Browser");
		String url= pUtil.fetchPropertyFileData("BaseUrl");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("internetExplorer"))
		{
			driver= new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("--Invalid Browser Value--");
		}
		
		wUtil.implicitWait(driver, 10);
		wUtil.maximizeWindow(driver);
		driver.get(url);
	}
	
	/**
	 * This method execute after each class execution finished.
	 * After class executed it will automatically quit the browser.
	 */
	public void AfterClassConfig()
	{
		driver.quit();
	}
	
}
