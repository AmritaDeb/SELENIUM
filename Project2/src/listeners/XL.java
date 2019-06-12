package listeners;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {

	public static void writeResultToXL(String input_path, String output_path, int passCount, int failCount){
		
		try{
			Workbook w = WorkbookFactory.create(new FileInputStream(input_path));
			w.getSheet("sheet1").getRow(1).getCell(0).setCellValue(passCount);
			w.getSheet("sheet1").getRow(1).getCell(1).setCellValue(failCount);
			w.write(new FileOutputStream(output_path));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
