/*
  	go to cleartrip.com specify bangalore in from field and specify delhi in to field
 	select any date from the calender click on search flights
	print the contains of list box
*/

package automation1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test80 {
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
		
		WebElement date = driver.findElement(By.cssSelector("a.ui-state-active"));    //default value selected
		//WebElement date = driver.findElement(By.xpath("//span[.='September']/../../..//a[.='8']"));
		System.out.println("Date:  " + date.getText());
		date.click();
		System.out.println("-------------");
		
		WebElement adults = driver.findElement(By.xpath("//strong[.='Adults']/../../..//option[2]"));
		System.out.println("No of Adults: " + adults.getText());
		adults.click();
		System.out.println("--------------");
		
		WebElement children = driver.findElement(By.xpath("//label[.='Children ']/../../..//option[2]"));
		System.out.println("No of Childrens: " + children.getText());
		children.click();
		System.out.println("--------------");
		
		WebElement infants = driver.findElement(By.xpath("//label[.='Infants ']/../../..//option[2]"));
		System.out.println("No of Infants: " + infants.getText());
		infants.click();
		System.out.println("--------------");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		driver.close();
	}
}