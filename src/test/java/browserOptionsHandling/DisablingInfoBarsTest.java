package browserOptionsHandling;

import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * @author Ajay Kumar
 * This class contains method for disabling the "InfoBars" for browsers.
 */

public class DisablingInfoBarsTest {

	/**
	 * This method is responsible for disabling the "Browser InfoBar".
	 */
	@Test
	public void disablingInfobarsTest()
	{
		ChromeOptions opt= new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
	}
}
