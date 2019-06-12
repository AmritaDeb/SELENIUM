
/*
 * 	1. Print content of listbox
	2. select and deselect all the options in reverse order
	3. print the contents of listbox in sorted order
	4. check if given option is present in list box or not
	5. check if given option is duplicate in list box
	6. print only unique options present in listbox
	7. print only duplicate options present in listbox
	8. print options present in listbox with their occurence
	9. check if content of listbox is in sorted order or not
	10. check is listbox is single select or multi select
 * */

package listing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel.html");
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		 List<WebElement> allOptions = select.getOptions();
		
		//Q.1. Print content of listbox
		int count = select.getOptions().size();
		for(WebElement option:allOptions){
			System.out.println(option.getText());
		}
		System.out.println("~~~~~~~~~~~~~~~");
		
		//Q.2. select and deselect all the options in reverse order
		for(int i=count-1;i>=0;i--){
			select.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		for(int i=count-1; i>=0; i--){
			select.deselectByIndex(i);
			Thread.sleep(2000);
		}
		
		//Q.3. print the contents of listbox in sorted order
		ArrayList<String> allText = new ArrayList<>();
		for(WebElement option:allOptions){
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for(String text:allText){
			System.out.println(text);
		}
		
		driver.close();
	}
}
