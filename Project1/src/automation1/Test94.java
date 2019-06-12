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



public class Test94 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
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
		System.out.println("Q8. print options present in listbox with their occurence");
		System.out.println(map);
		
		 //Q4. check if given option is present in list box or not
		System.out.println("Enter the key: ");
		String given = s.next();
		if(map.containsKey(given))
		{
			System.out.println("yes, given option "+ given + " is present");
		}
		else
		{
			System.out.println("no, given option "+ given + " is not present");
		}
		
			//Q5. check if given option is duplicate in list box
		System.out.println("Q5. check if given option is duplicate in list box");
		System.out.println("Enter the option:");
		String given_option = s.next();
		if(map.get(given_option)>1)
		{
			System.out.println("yes, given option "+ given_option + " is duplicate");
		}
		else
		{
			System.out.println("no, given option "+ given_option + " is not duplicate");
		}
		
			//Q6. print only unique options present in listbox
		System.out.println("Q6. print only unique options present in listbox");
		Set<String> allKeys = map.keySet();
		for(String key:allKeys)
		{
			Integer count = map.get(key);
			if(count==1)
			{
				System.out.println(key);
			}
		}
		
			//Q7. print only duplicate options present in listbox
		System.out.println("Q7. print only duplicate options present in listbox");
		for(String key:allKeys)
		{
			Integer count = map.get(key);
			if(count>1)
			{
				System.out.println(key);
			}
		}
		
		
		
	}
}