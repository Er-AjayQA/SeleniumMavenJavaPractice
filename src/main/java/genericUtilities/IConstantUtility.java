package genericUtilities;

/**
 * @author Ajay Kumar
 * This is "IConstantUtility" interface, which holds data like "Paths" which will remains constant for whole project.
 * This interface will hold the path for "ExcelFile", "PropertyFile", etc.
 */
public interface IConstantUtility {

		/**
		 * This is "Excel File Path".
		 * This file contains all the test data in it.
		 */
		public static String excelFilePath= ".\\src\\test\\resources\\TestData.xlsx";
		
		/**
		 * This is "Property File Path".
		 * This file contains all the configuration in the form of "Keys-Values" format.
		 */
		public static String propertyFilePath= ".\\src\\test\\resources\\PropertyFile.properties";
}
