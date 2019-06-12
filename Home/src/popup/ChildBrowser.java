package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		for(String wh:allWHS){
			driver.switchTo().window(wh).close();
		}
	}
}
