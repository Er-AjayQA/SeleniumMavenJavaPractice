package synchronizationHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Ajay Kumar
 * "Java Wait" is the dead wait provided by "thread.sleep()".
 * It will halt the execution for the given time, no matter even if the web element get appeared before the given time.
 * Hence it is also called "dead wait".
 */

public class JavaWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		WebElement userEmail = driver.findElement(By.id("identifierId"));
		Thread.sleep(5000);
		userEmail.sendKeys("ak2681993@gmail.com");

	}

}
