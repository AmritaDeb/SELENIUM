package actitime;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp = new LoginPage(driver);
		/*
			//fetching data from xl sheet Book1.xlsx
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		String un = w.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String pw = w.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
			//login
		lp.setUserName(un);
		lp.setPassword(pw);
		lp.clickLogin();
		Thread.sleep(2000);
		driver.close();
		*/
		
		//fetching data from xl sheet Book2.xlsx
		Workbook w2 = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		String un2 = w2.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		Cell c = w2.getSheet("sheet1").getRow(1).getCell(1);
		String pw2 = c.toString();
		
		//login
		lp.setUserName(un2);
		lp.setPassword(pw2);
		lp.clickLogin();
		
	}
}


/*
 * 	Note: To read data from cell of xl sheet we can use toString(), it works on any type of cell(i.e, cellmay contain String, Number, date...)
 * To get number from cell without .0 specify ' at the begining
 * */
