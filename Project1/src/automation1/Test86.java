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


public class Test86 {
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
		
			//Q11. Count the options
		System.out.println("Q11. Count the options:");
		int count = allOptions.size();
		System.out.println(count);
			//Q1.Print content of listbox
		System.out.println("Q1.Print content of listbox");
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
			//Q2. Select and deselect all the options in reverse order
		System.out.println("Q2. Select and deselect all the options in reverse order:");
		for(int i=count-1; i>=0; i--)
		{
			select.selectByIndex(i);
		}
		for(int i=count-1; i>=0; i--)
		{
			select.deselectByIndex(i);
		}
			//Q3. Print the contents of listbox in sorted order
		System.out.println("Q3. Print the contents of listbox in sorted order:");
		ArrayList<String> allText = new ArrayList<>();
		for(WebElement option:allOptions)
		{
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for(String text:allText)
		{
			//allText.add(text);
			System.out.println(text);
		}
			//Q10. check is listbox is single select or multi select
		System.out.println("Q10. check is listbox is single select or multi select: ");
		if(select.isMultiple())
		{
			System.out.println("It's multi select listbox");
		}
		else
		{
			System.out.println("It's single select listbox");
		}
		
		
		
		driver.close();
	}
}