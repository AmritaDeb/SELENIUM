
/*	Write a script to print content of xl sheet
 * 	UserName Password
 * 	  admin   manager
 * 	  adam    damager
 */

package xl;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {
	public static void main(String[] args) throws Exception{
	
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book0.xlsx"));
		int rc = w.getSheet("sheet1").getLastRowNum();
		for(int i=0; i<=rc; i++){
			int cc = w.getSheet("sheet1").getRow(0).getLastCellNum();
			for(int j=0; j<cc; j++){
				String v = w.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}
}
