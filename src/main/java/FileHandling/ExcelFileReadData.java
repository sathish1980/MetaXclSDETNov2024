package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadData {
	
	String filepath = "C:\\Users\\kumar\\eclipse-workspace\\MetaXclSDETNov2024\\Input\\Testdata.xlsx";

	
	public void readdata() throws IOException {
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F);
		// read rows and column
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		// move to specific sheet
		Sheet sheet = wbk.getSheet("foodItem");
		// to get the used row
		int TotalRow = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<TotalRow;i++)
		{
			// each row
			Row eachRow = sheet.getRow(i);
			//total used columns
			int totalColumns = eachRow.getLastCellNum();
			
			for(int j=0;j<totalColumns;j++)
			{
				Cell eachcell = eachRow.getCell(j);
				System.out.print(eachcell.getStringCellValue());
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileReadData E = new ExcelFileReadData();
		E.readdata();
	}

}
