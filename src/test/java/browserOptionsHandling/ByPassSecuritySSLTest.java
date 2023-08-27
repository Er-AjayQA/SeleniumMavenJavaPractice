package browserOptionsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This class contain method for "ByPassing the SSL".
 */

public class ByPassSecuritySSLTest {
	
	/**
	 * This method is responsible for "ByPassing SSL".
	 * @throws InterruptedException
	 */
	@Test
	public void byPassSecuritySSLTest() throws InterruptedException
	{
		FirefoxOptions opt= new FirefoxOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://expired.badssl.com/");
		
	}

}
