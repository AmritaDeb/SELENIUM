/*
 	write a script to upload the cv in https://www.monsterindia.com/ 	
*/

package automation1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test53 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("amy");
		Thread.sleep(2000);
		driver.findElement(By.id("mob_no")).sendKeys("abc");
		Thread.sleep(2000);
		
		File f = new File("./cv/CV_Amrita.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("wordresume")).sendKeys(path);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}