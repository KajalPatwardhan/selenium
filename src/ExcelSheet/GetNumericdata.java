package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericdata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\chetan\\Documents\\study\\abc.xlsx");
		 double value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getNumericCellValue();
		 System.out.println(value);
		//Workbook book = WorkbookFactory.create(file);
		//Sheet sh = book.getSheet("sheet1");
	//	Row rw = sh.getRow(0);
		//   Cell cl = rw.getCell(1);
		  //double numeric = cl.getNumericCellValue();
		  ///System.out.println(numeric);
	
}
}
