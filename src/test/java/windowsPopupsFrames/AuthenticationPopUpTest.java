package windowsPopupsFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how can we deal with "Authentication PopUps".
 * We can send "credentials" along with the URL itself.
 */

public class AuthenticationPopUpTest extends BaseClassUtility{
	
	@Test
	public void authenticationPopupTest()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		wUtil.maximizeWindow(driver);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
