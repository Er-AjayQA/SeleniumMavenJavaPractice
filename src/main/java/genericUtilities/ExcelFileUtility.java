package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Ajay Kumar
 * This class contains all the "Excel FIle" related methods.
 * Methods like fetch and return data from excel file.
 */
public class ExcelFileUtility {

	/**
	 * This method fetch and return the data from the excel file.
	 * This method fetch and return one data at a time.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String fetchExcelFileData(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream(IConstantUtility.excelFilePath);
		Workbook book = WorkbookFactory.create(file);
		String value = book.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}
}
