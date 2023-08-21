package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTheOptionOfDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement menuOptions = driver.findElement(By.id("searchLanguage"));
		Select sel= new Select(menuOptions);
		List<WebElement> allMenuOptions = sel.getOptions();
		for(WebElement element:allMenuOptions)
		{
			String value= element.getText();
			System.out.println(value);
		}

	}

}
