package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * "FindElement" method is used to find/locate the webElement of web page.
 * "findElement" return type is "WebElement".
 */
public class FindElementMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		WebElement userEmail = driver.findElement(By.id("identifierId"));
		userEmail.sendKeys("abc@gmail.com");
		WebElement nextBtn= driver.findElement(By.xpath("//div[@id='playCaptchaButton']//child::span[@jsname='V67aGc']"));
		nextBtn.click();

	}

}
