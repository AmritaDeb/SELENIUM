
/*	Write a script to write a content in xl sheet
 */

package xl;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
	
		public static void main(String[] args) throws Exception{
		
			Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book0.xlsx"));
			Cell c = w.getSheet("sheet1").getRow(2).getCell(1);
			c.setCellValue("Qspider");
			w.write(new FileOutputStream("./data/Book.xlsx"));
			//if path is diff -> save As..
		}
}
