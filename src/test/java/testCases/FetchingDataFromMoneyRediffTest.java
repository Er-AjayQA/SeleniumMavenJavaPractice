package testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import genericUtilities.BaseClassUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingDataFromMoneyRediffTest extends BaseClassUtility{

	@Test
	public void fetchingDataFromMoneyRediffTest() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		wUtil.maximizeWindow(driver);
		wUtil.implicitWait(driver, 10);
		String baseUrl= pUtil.fetchPropertyFileData("Money_Rediff_com");
		driver.get(baseUrl);
		
		String linkLocator = pUtil.fetchLocatorsFromORFile("Link_Text");
		driver.findElement(By.linkText(linkLocator)).click();
		
		String tableRows= pUtil.fetchLocatorsFromORFile("Total_Table_Rows_Xpath");
		String tableColumn= pUtil.fetchLocatorsFromORFile("Total_Table_Column_Xpath");
		
		int rowCount = driver.findElements(By.xpath(tableRows)).size();
		int colCount = driver.findElements(By.xpath(tableColumn)).size();
		
		System.out.println("Total Rows ->"+rowCount);
		System.out.println("Total Columns ->"+colCount);
		
		String firstPart= "//table[@class='dataTable']/descendant::tbody/tr[";
		String secondPart= "]/td[";
		String thirdPart= "]";
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=1; j<=colCount; j++)
			{
				String finalPart= firstPart+i+secondPart+j+thirdPart;
				String value= driver.findElement(By.xpath(finalPart)).getText();
				System.out.print(value+"  ");
			}
			System.out.println("");
		}
		
	}
}
