/*
  	go to cleartrip.com specify bangalore in from field and specify delhi in to field
 	select any date from the calender click on search flights
 	print all the prices and print the lowest price

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


public class Test78 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("FromTag")).sendKeys("bangalore");
		Thread.sleep(2000);
		String from_xp = "//a[contains(text(),'BLR')]";
		driver.findElement(By.xpath(from_xp)).click();
		
		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
		Thread.sleep(2000);
		String to_xp = "//a[contains(text(),'DEL')]";
		driver.findElement(By.xpath(to_xp)).click();
		
		//driver.findElement(By.cssSelector("a.ui-state-active")).click();    //default value selected
		driver.findElement(By.xpath("//span[.='September']/../../..//a[.='25']")).click(); 
		driver.findElement(By.id("SearchBtn")).click();
		
		String xp = "//th[@class='price']";
		List<WebElement> allPrice = driver.findElements(By.xpath(xp));
		ArrayList<Integer> allPriceNum = new ArrayList<>();
		
		for(WebElement price:allPrice)
		{
			String text = price.getText().substring(1).replaceAll(",", "");
			allPriceNum.add(Integer.parseInt(text));
		}
			
		System.out.println("---------------------------");
		Collections.sort(allPriceNum);
		for(Integer num:allPriceNum)
		{
			System.out.println(num);
		}
		System.out.println("The min price is: " + allPriceNum.get(0));
		System.out.println("---------------------------");
		Collections.sort(allPriceNum, Collections.reverseOrder());
		System.out.println("The max price is: " + allPriceNum.get(0));
		
		driver.close();
	}
}