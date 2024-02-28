package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	public static void main(String[] args) throws IOException {
		// set the file path
		XSSFWorkbook book = new XSSFWorkbook("./excel/CreateLead.xlsx");
		// get the Sheet from the book
		XSSFSheet sheet = book.getSheet("Sheet1");
		// To get the row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count " + rowCount);
		// To get coloumn count
		int coloumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Col" + coloumnCount);
		// String[][] data=new String[1][3];

		// i<=2
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < coloumnCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();

				System.out.println(stringCellValue);
			}

		}
	}
}
