/*
  	go to hotel.html, print all the listbox contents
*/

package automation1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test87 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel1.html");
		driver.manage().window().maximize();
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		List<WebElement> allOPtions = select.getOptions();
		ArrayList<String> allText = new ArrayList<>();
		
		for(WebElement option:allOPtions)
		{
			allText.add(option.getText());
		}
		
		Collections.sort(allText);
		System.out.println(allText);
		
		Collections.sort(allText, String.CASE_INSENSITIVE_ORDER);
		System.out.println(allText);
		
		driver.close();
	}
}