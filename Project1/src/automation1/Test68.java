/*
 	Count the number of links in flipkart bt tagname
*/

package automation1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test68 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/QSpiders/SELENIUM/html/demo4.html");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++){
		
		WebElement link = allLinks.get(i);
		String text = link.getText();
		System.out.println(text);
		
		}		
		driver.close();
	}
}