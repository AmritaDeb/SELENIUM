package select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel.html");
		driver.manage().window().maximize();
		
		WebElement listbox = driver.findElement(By.id("mtr"));
		
		Select select = new Select(listbox);
		
		if(select.isMultiple()){
			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByValue("v");
			Thread.sleep(2000);
			select.selectByVisibleText("Poori");
			Thread.sleep(2000);
			
			System.out.println(select.getOptions().size());
			System.out.println(select.getAllSelectedOptions().size());
			System.out.println(select.getFirstSelectedOption().getText());
			
			driver.close();
		}
	}
}
