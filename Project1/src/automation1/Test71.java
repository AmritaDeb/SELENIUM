/*
 	Go to yatra.com, enter Bangalore in the hotel search field
 	get all the auto suggestions,
 	count the total auto suggestions and print,
 	select the first 1, proceed with all the options and click on search
*/

package automation1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test71 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[.='Hotels']")).click();
		driver.findElement(By.id("BE_hotel_destination_city")).sendKeys("bangalore");
		
		Thread.sleep(5000);
		
		String xp = "//strong[text()='Bangalore']/..";
		List<WebElement> allResult = driver.findElements(By.xpath(xp));
		
		int count = allResult.size();
		System.out.println(count);
		System.out.println("----------------------------------------");
		
		 // (another way)
		  for(WebElement link:allResult){
			System.out.println(link.getText());
		}
		/*
		for(int i=0; i<count; i++)
		{
			WebElement link = allResult.get(i);
			System.out.println(link.getText());
		}*/
			//select the 1st link 
		allResult.get(0).click();
			//select the check-in
		driver.findElement(By.id("04/10/2018")).click();
			//click on check-out text field
		driver.findElement(By.id("BE_hotel_checkout_date")).click();
			//select the check-out
		driver.findElement(By.id("08/10/2018")).click();
			//click on hotel info field (no of people & no of room)
		driver.findElement(By.id("BE_Hotel_pax_info")).click();
			//click on 'Done' link
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
			//click on search button
		driver.findElement(By.id("BE_hotel_htsearch_btn")).click();
		
		driver.findElement(By.xpath("//img[contains(@ng-src,'flexistay')]")).click();
		
		driver.close();
	}
}