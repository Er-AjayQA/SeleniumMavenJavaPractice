package practicleImplementationOfCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to get and print all the available links on the webPage.
 */

public class GettingAllTheLinksOfWebPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks)
		{
			System.out.println(link.getAttribute("href"));
			//System.out.println(link.getText());
		}

	}

}
