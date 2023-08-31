package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class WebDriverUtility {
	
	/**
	 * This method maximize the browser.
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method provides the implicitWait by desired amount of time.
	 * @param driver
	 * @param waitTime
	 */
	public void implicitWait(WebDriver driver, int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
	}
	
	/**
	 * This method is for taking screenshot and return path of screenshot.
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException
	{
		TakesScreenshot sc= (TakesScreenshot)driver;
		File src= sc.getScreenshotAs(OutputType.FILE);
		File dest= new File(".\\src\\test\\resources\\Screenshots\\"+screenShotName+".png" );
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	}

}
