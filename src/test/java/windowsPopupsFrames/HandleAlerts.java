package windowsPopupsFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example show how we can handle the "Alert PopUps".
 */
public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert(); // Switch the driver controls to alert box.
		System.out.println(alt.getText()); // To print the text in the alert box.
		alt.accept(); // To accept/click on "OK" button in alert box.

	}

}
