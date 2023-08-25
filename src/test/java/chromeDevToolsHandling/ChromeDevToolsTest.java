package chromeDevToolsHandling;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v114.emulation.Emulation;
import org.openqa.selenium.devtools.v114.security.Security;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;

/**
 * @author Ajay Kumar
 * The "CDP" provides the option for handling the "Chrome Developers Tools". 
 */

public class ChromeDevToolsTest extends BaseClassUtility {

	@Test
	public void badSslTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		wUtil.maximizeWindow(driver);
		DevTools devTool = ((HasDevTools)driver).getDevTools();
		devTool.createSession();
		
		devTool.send(Security.enable());
		devTool.send(Security.setIgnoreCertificateErrors(true));
		
//		devTool.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));
//		driver.get("https://mycurrentlocation.net/");
	}
	
	@Test
	public void changeCurrentGeoLocationTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		wUtil.maximizeWindow(driver);
		DevTools devTool = ((HasDevTools)driver).getDevTools();
		devTool.createSession();
		
		devTool.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));
		driver.get("https://mycurrentlocation.net/");
	}
	
	@Test
	public void mobileViewTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		wUtil.maximizeWindow(driver);		
		Map<String, Object> deviceMetrics= new HashMap<String, Object>(){{
			put("width", 600);
			put("height", 1000);
			put("deviceScaleFactor", 50);
			put("mobile", true);
		}};
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://www.selenium.dev/");
	}
}
