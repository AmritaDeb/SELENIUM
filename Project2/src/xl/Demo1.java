package xl;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws Exception{
			//Open xl file(WorkBook)
		FileInputStream fis = new FileInputStream("./data/Book0.xlsx");
		Workbook w = WorkbookFactory.create(fis);
			//Go to sheet1 -->1st row-->1st cell
		Cell c = w.getSheet("sheet1").getRow(0).getCell(0);
			//get value present in the cell & print it
		String v = c.getStringCellValue();
		System.out.println(v);
			//row count -counting starts from 0
		 int rc = w.getSheet("sheet1").getLastRowNum();
		System.out.println(rc);
			//cell count -counting starts from 0
		int cc = w.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(cc);
			//close the file
		w.close();
	}
}
