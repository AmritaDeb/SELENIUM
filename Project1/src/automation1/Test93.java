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


public class Test93 {
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
			if(map.containsKey(text))
			{
				Integer v = map.get(text);
				v++;
				map.put(text,v);
			}
			else
			{
				map.put(text, 1);
			}
		}
		
			//Q8. print options present in listbox with their occurence
		
		System.out.println(map);
		
		 //Q4. check if given option is present in list box or not
		String given = "Idly";
		if(map.containsKey(given))
		{
			System.out.println("yes, given option "+ given + " is present");
		}
		else
		{
			System.out.println("no, given option "+ given + " is not present");
		}
		driver.close();
	}
}