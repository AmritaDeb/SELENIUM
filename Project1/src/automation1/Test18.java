
/*	Goto the url https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php,
	find the textbox & type abcd
*/

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
	WebDriver driver = new ChromeDriver();
		//Enter the URL
	driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
	
		//find element of checkbox
	WebElement chbx = driver.findElement(By.xpath("//input[@type='checkbox']"));
		//click on the checkbox
	chbx.click();
	
	boolean condition1=chbx.isSelected();
	WebElement tbx = driver.findElement(By.name("other_text"));
	boolean condition2 = tbx.isEnabled();
	
	if(condition1 && condition2)
	{
		// enter abcd on the textfield
		tbx.sendKeys("abcd");
		// wait for 2 mins
		Thread.sleep(2000);
		// clear the textfield
		tbx.clear();
	}
	
		//Close the browser
	driver.close();
	}
}
