package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider="getData")
	public void dataDriven(String greetings,String name, String id)
	{
		System.out.println(greetings+name+id);
	}
	
	
	@DataProvider(name="getData")
	public Object[][] getData() throws IOException
	{
//		Object data[][] = {{"hello","Jyotsana","1"},{"Hi","Nishu","2"},{"Bye","Annu","3"}};
//		return data;
		
		FileInputStream fis = new FileInputStream("C:/Users/jyotsana.pandey/Documents/TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++)
		{
			row = sheet.getRow(i+1);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		return data;
	}

}
