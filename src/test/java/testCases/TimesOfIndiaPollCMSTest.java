package testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TimesOfIndiaPollCMSTest extends BaseClassUtility{

	@Test
	public void timesOfIndiaPollCMSTest() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		wUtil.maximizeWindow(driver);
		String baseUrl= pUtil.fetchPropertyFileData("TimesOfIndiaPollCMSUrl");
		driver.get(baseUrl);
		String equation= pUtil.fetchLocatorsFromORFile("Equation_ID");
		String value= driver.findElement(By.id(equation)).getText();
		System.out.println(value);
	}
}
