package SELWeek5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public Object[][] readExcel() throws IOException {
	
	//Create a folder and name it as data
			//Create a xlsx file with in that folder with req rows and columns
			
			//Open the excel from the path
			XSSFWorkbook workBook = new XSSFWorkbook("./data/TC001.xlsx");
			
			//Go to the first sheet
			XSSFSheet sheet = workBook.getSheetAt(0);
			
			//Find the number of rows in the sheet
			int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
			
			//Go to Header row
			XSSFRow headerRow = sheet.getRow(0);
			
			//Go to the header row and find the number of columns
			int ColumnCount = headerRow.getLastCellNum();
			System.out.println(ColumnCount);
			Object[][] data = new Object[rowcount][ColumnCount];
			
			
			for (int i= 1; i <= rowcount; i++) {
				//Go to first row
				XSSFRow firstrow = sheet.getRow(i);
				
				for (int j = 0; j < ColumnCount; j++) {
					//Go to first cell of that row
					XSSFCell cell = firstrow.getCell(j);
					//Print the content of that cell
					String stringCellValue = cell.getStringCellValue();
					data[i-1][j] = stringCellValue;
					System.out.println(stringCellValue);
				}
			}
			return data;
			
			
		} 
			

}
