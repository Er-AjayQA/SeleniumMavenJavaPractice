package log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *@author Ajay Kumar
 *This class provide methods for "Log4J".
 *We have a class "Logger" which provide methods like "getLogger()".
 *Log levels have "Info", "Debug", "error". 
 *It has file named as "Log4J.properties" which contains "appenders".
 *To load property file we have "PropertyConfigurator".
 */

public class Log4JTest extends BaseClassUtility{
	
	public Logger log= Logger.getLogger(Log4JTest.class);
	/**
	 * This method is example of "Log4J".
	 */
	@Test
	public void log4JTest()
	{
		PropertyConfigurator.configure(".\\src\\test\\resources\\Properties\\log4J.properties");
		log.info("Browser execution started.");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://google.com");		
		log.info("Url Loaded");
	}
}
