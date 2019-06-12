package btm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	//this class is POM class
public class LoginPage1 {
	
	// Declaration
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	// Utilization
	public void clickLogin(){
		loginBTN.click();
	}
	

}
