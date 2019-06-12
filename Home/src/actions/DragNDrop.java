package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		
		actions.clickAndHold(source).moveToElement(target).release().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
