/*
  	go to hotel.html, print all the listbox contents
*/

package automation1;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test92 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel2.html");
		driver.manage().window().maximize();
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		List<WebElement> allOPtions = select.getOptions();
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for(WebElement option:allOPtions)
		{
			String text = option.getText();
			map.put(text, 1);
		}
		
		System.out.println(map);
		driver.close();
	}
}