package home1;

import java.util.Date;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		String v = s.replaceAll(":", "-");
		System.out.println(v);
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./photo/login_"+v+".png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}
