package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
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
		
		/*
		 * Options opt = driver.manage(); //manage() return type is "Options". Window
		 * win = opt.window(); //window() return type is "Window". win.maximize();
		 */
		
		driver.manage().window().maximize(); // We can write all the above code in single line like this.
		driver.get("https://gmail.com");

	}

}
