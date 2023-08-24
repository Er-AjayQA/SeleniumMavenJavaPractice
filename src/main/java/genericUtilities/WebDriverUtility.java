package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

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

}
