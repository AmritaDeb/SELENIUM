package btm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	// Declaration
	private WebElement loginBTN;
	
	// Initialization
	public LoginPage(WebDriver driver){
		loginBTN = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	// Utilization
	public void clickLogin(){
		loginBTN.click();
	}
	

}
