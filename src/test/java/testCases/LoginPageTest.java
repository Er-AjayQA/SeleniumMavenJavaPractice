package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;

public class LoginPageTest extends BaseClassUtility {

	@Test
	public void loginPageTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		wUtil.maximizeWindow(driver);
		String url= pUtil.fetchPropertyFileData("TestLoginUrl");
		driver.get(url);
		String userID= pUtil.fetchLocatorsFromORFile("username");
		String passwordID= pUtil.fetchLocatorsFromORFile("password");
		String submitBtn= pUtil.fetchLocatorsFromORFile("submit");
		
		driver.findElement(By.id(userID)).sendKeys("student");
		driver.findElement(By.id(passwordID)).sendKeys("Password123");
		driver.findElement(By.id(submitBtn)).click();
		
	}
}
