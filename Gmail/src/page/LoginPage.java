package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	@FindBy(id="identifierId")
	private WebElement unTB;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nextBTN;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	//Initialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickNext(){
		nextBTN.click();
	}
	
}
