package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Identify testcases column by scanning the entire 1st row
		//once coloumn is identified then scan entire testcases coloumn to identified purchase testcase
		//after you grab purchase testcase row then pull all the data of that row and feed into test
		FileInputStream fis = new FileInputStream("C:/Users/jyotsana.pandey/Documents/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("purchase"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rowIt = sheet.rowIterator(); //sheet is collection of rows
				//while(rowIt.hasNext())
				//{
					Row row = rowIt.next();
					Iterator<Cell> cellIt = row.cellIterator();	//row is collection of cell
					int k=0;
					int coloumn = 0;
					while(cellIt.hasNext())
					{
						Cell cell = cellIt.next();
						if(cell.getStringCellValue().equalsIgnoreCase("TestCases"))
						{
							coloumn=k;
							//System.out.println(cell.getNumericCellValue());
						}
						k++;
//						if(cell.getCellType()==CellType.STRING)
//						{
//							System.out.println(cell.getStringCellValue());
//						}
						
					}
					System.out.println(coloumn);
				//}
			}
		}
	}

}
