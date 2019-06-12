package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//this class is POM class
public class LoginPage4 {
	
	// Declaration
	final String s = "username";
	@FindBy(id=s)
	private WebElement unTB ;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	// Initialization
	public LoginPage4(WebDriver driver){
		PageFactory.initElements(driver, this);     //initElements() accept 2 arguments: WebDriver , current class object ref variable
	}
	
	// Utilization
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginBTN.click();
	}
	

}
