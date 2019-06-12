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



public class Test95 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel.html");
		driver.manage().window().maximize();
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		
		ArrayList<String> ls1 = new ArrayList<>();
		
		
		for(WebElement option:allOptions)
		{
			ls1.add(option.getText());
		}
		ArrayList<String> ls2 = new ArrayList<String>(ls1);
		System.out.println("ArrayList ls1 before sorting : " + ls1);
		System.out.println("ArrayList ls2 before sorting : " + ls2);
		Collections.sort(ls2);
		System.out.println("ArrayList ls2 after sorting : " + ls2);
		
		if(ls1.equals(ls2))
		{
			System.out.println("lb is in sorted order");
		}
		else
		{
			System.out.println("lb is not in sorted order");
		}
		
	}
}