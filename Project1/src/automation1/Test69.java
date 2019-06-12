/*
 	print all the prices, display on the page, which starts with 'from' and 'now' on flipkart.com
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test69 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		String xp = "//div[starts-with(text(),'From') or starts-with(text(),'Now')]";
		List<WebElement> allPrice = driver.findElements(By.xpath(xp));
		
		int count = allPrice.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++){
		
		WebElement link = allPrice.get(i);
		String text = link.getText();
			if(text.length()>0){
				System.out.println(text);
			}
		}
		System.out.println("----------------------");
		driver.close();
	}
}