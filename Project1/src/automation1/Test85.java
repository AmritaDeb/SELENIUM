/*
  	go to hotel.html, print all the listbox contents
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test85 {
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
		
		List<WebElement> elementCount = select.getOptions();
		
		int count = select.getOptions().size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String optionsValue = elementCount.get(i).getText();
			System.out.println(optionsValue);
		}
		
		driver.close();
	}
}