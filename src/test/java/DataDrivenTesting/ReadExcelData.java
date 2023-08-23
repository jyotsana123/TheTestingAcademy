package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:/Users/jyotsana.pandey/Documents/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIt = sheet.rowIterator();
		
		while(rowIt.hasNext())
		{
			Row row = rowIt.next();
			Iterator<Cell> cellIt = row.cellIterator();
			
			while(cellIt.hasNext())
			{
				Cell cell = cellIt.next();
				if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue());
				}
				if(cell.getCellType()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue());
				}
				
			}
		}
	}

}
