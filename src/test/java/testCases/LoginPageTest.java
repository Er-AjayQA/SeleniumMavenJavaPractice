package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends BaseClassUtility {

	@Test
	public void loginPageTest() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		wUtil.maximizeWindow(driver);
		String url= pUtil.fetchPropertyFileData("TestLoginUrl");
		driver.get(url);
		String userID= pUtil.fetchLocatorsFromORFile("UserName_ID");
		String passwordID= pUtil.fetchLocatorsFromORFile("PassWord_ID");
		String submitBtn= pUtil.fetchLocatorsFromORFile("SubmitBtn_ID");
		String userName= pUtil.fetchPropertyFileData("LoginUserName");
		String passWord= pUtil.fetchPropertyFileData("LoginPassWord");
		
		driver.findElement(By.id(userID)).sendKeys(userName);
		driver.findElement(By.id(passwordID)).sendKeys(passWord);
		driver.findElement(By.id(submitBtn)).click();
		
	}
}
