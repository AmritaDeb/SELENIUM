/*
  	go to snapdeal.com
	search iphone x and select the 1st auto suggestion
 	get all the displayed prices
 	print the min and max price
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


public class Test76 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		
		Thread.sleep(5000);
		
		//String xp = "(//span[.='iphone'])[1]"; 
			//OR
		String xp = "(//a[@data-labelname='iphone x'])[1]";
		driver.findElement(By.xpath(xp)).click();
		
		Thread.sleep(9000);
		
		//String price_xp = "(//p[contains(text(),'iPhone X')])/following-sibling::div[1]/div/span[2]";
			//OR
		String price_xp = "//span[@class='lfloat product-price']";
		List<WebElement> allPrice = driver.findElements(By.xpath(price_xp));
		
		int count = allPrice.size();
		System.out.println(count);
		System.out.println("--------------------------");
		
		/*
		for(int i=0; i<count; i++ )
		{
			System.out.println(allPrice.get(i).getText());
		}
		*/
		
		/*
		for(WebElement price:allPrice)
		{
			String text = price.getText();
			System.out.println(text);
		}
		*/
		
		ArrayList<Integer> allPriceNum = new ArrayList<>();
		
		for(WebElement price:allPrice)
		{
			String text = price.getAttribute("data-price");
			int v = Integer.parseInt(text);
			allPriceNum.add(v);
			//System.out.println(text);
		}
		
		Collections.sort(allPriceNum);
		
		for(Integer num:allPriceNum)
		{
			System.out.println(num);
		}
		System.out.println("---------------------------");
		System.out.println("The min price is: " + allPriceNum.get(0));
		System.out.println("---------------------------");
		System.out.println("The min price is: " + allPriceNum.get(count - 1));
		
		driver.close();
	}
}