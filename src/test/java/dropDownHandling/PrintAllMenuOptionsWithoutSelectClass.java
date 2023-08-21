package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Ajay Kumar
 * This example shows how to get and print all the available menu options in dropDown.
 * Here we will not using any "Select" class predefined methods.
 */

public class PrintAllMenuOptionsWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> menuOptions = driver.findElements(By.xpath("//option"));
		System.out.println(menuOptions.size());
		for(WebElement element:menuOptions)
		{
			String value= element.getText();
			System.out.println(value);
		}

	}

}
