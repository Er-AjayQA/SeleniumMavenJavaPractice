package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ajay Kumar
 * This class contains the property file methods to fetch data.
 */
public class PropertyFileUtility {

	/**
	 * This method fetch and return the desired property value from property file.
	 * @param property
	 * @return
	 * @throws IOException
	 */
	public String fetchPropertyFileData(String property) throws IOException
	{
		FileInputStream file= new FileInputStream(IConstantUtility.propertyFilePath);
		Properties pro= new Properties();
		pro.load(file);
		return pro.getProperty(property);
	}
	
	/**
	 * This method fetch and return the desired locator values from property file.
	 * @param property
	 * @return
	 * @throws IOException
	 */
	public String fetchLocatorsFromORFile(String property) throws IOException
	{
		FileInputStream file= new FileInputStream(IConstantUtility.ObjectRepositorypropertyFilePath);
		Properties pro= new Properties();
		pro.load(file);
		return pro.getProperty(property);
	}
}
