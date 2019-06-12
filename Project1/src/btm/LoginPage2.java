package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//this class is POM class
public class LoginPage2 {
	
	// Declaration
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	// Initialization
	public LoginPage2(WebDriver driver){
		PageFactory.initElements(driver, this);     //initElements() accept 2 arguments: WebDriver , current class object ref variable
	}
	
	// Utilization
	public void clickLogin(){
		loginBTN.click();
	}
	

}
