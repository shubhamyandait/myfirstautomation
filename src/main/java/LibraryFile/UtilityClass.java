package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	//in Utility class we declair those functionality which are common to selenium  
		// EX: fetch data from excel , ScreenShot , handle iframe etc
		
		
		
		
		//@Auther:Shubham
		//this method use to get data from excel
		//need to pass 2 parameter : 1.rowIndex  2.cellIndex	
	public static String getTestData(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\shubhamIT\\destiny\\programs\\Maven\\TestData\\selenium excel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("kite");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	
	//this method is use to take fail test case screenshot
		//we need to pass two parameter : 1.webdriver object  2.TestcaseID
		//@Authername:shubham
	public static void capturescreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\shubhamIT\\destiny\\programs\\Maven\\FailedTCScreenShot\\TestcaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("F:\\shubhamIT\\destiny\\programs\\Maven\\propertyfile.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
}
