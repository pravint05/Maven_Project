package library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass {
	// fetch/read data from property file
	@Test
	public static String GetData(String key) throws IOException {
		// To reach upto property file
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Tellstar\\eclipse-workspace\\MavenProject\\Property.properties");

		// Create object of properties class
		Properties Prop = new Properties();

		// To open property file
		Prop.load(file);

		// To fetch/read data
		String Value1 = Prop.getProperty(key);
		return Value1;
	}

	@Test
	public static String FetchExceldata(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\eclipse-workspace\\MavenProject\\TestData\\parameterization.xlsx");
		Sheet Sh = WorkbookFactory.create(F1).getSheet("Sheet4");
		String DataFetch = Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return DataFetch;

	}

	@Test
	public static void ScreenShot(WebDriver driver) throws IOException {
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Tellstar\\eclipse-workspace\\MavenProject\\Screenshot\\Sample1.png");
		FileHandler.copy(Source, Destination);
	}

}
