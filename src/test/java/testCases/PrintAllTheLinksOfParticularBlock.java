package practicleImplementationOfCodes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to get link from particular block of webPage.
 * This example also shows How we can access "findElements()" method by "WebElement".
 */

public class PrintAllTheLinksOfParticularBlock {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement block = driver.findElement(By.xpath("//div[@class='other-projects']"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println("Total Links --> "+links.size());
		for(WebElement link: links)
		{
			System.out.println(link.getAttribute("href"));
		}
	}

}
