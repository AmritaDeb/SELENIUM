
/*
  	go to hotel.html, check:
  	1. listbox is multiple or not
  	2. count the options of listbox
  	3. count the selected option of listbox
  	4. print the first selected option
  	5. deselect the options one by one
*/

package listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/QSpiders/SELENIUM/html/hotel.html");
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		
		//Q.1.
		System.out.println(select.isMultiple());
		System.out.println("~~~~~~~~~");
		
		//Q.2.
		System.out.println(select.getOptions().size());
		System.out.println("~~~~~~~~~~");
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("v");
		Thread.sleep(2000);
		select.selectByVisibleText("Poori");
		Thread.sleep(2000);
		
		//Q.3.
		System.out.println(select.getAllSelectedOptions().size());
		System.out.println("~~~~~~~~~~");
		
		//Q.4.
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("~~~~~~~~~~");
		
		//Q.5.
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectAll();
		
		driver.close();
	}
}
