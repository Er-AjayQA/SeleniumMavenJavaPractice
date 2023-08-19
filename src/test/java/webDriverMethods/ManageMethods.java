package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * "manage()" is used to handle the browsers options.
 * "manage()" is coming from the "remoteWebDriver" class.
 * "manage()" returns "options".
 */
public class ManageMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");

	}

}
