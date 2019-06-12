package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage1 {

	//Declaration
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserLink;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstName;
	@FindBy(id="closeUserDataLightBoxBtn")
	private WebElement closeLink;
	
	private WebDriver driver;
	private Alert alert;
	
	//Initialization
	public UserListPage1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickAddUserLink(){
		addUserLink.click();
	}
	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	public void clickCloseLink(){
		closeLink.click();
	}
	public String alertMsg(){
		alert = driver.switchTo().alert();
		String msg = alert.getText();
		return msg;
	}
	public void clickOkOnAlert(){
		alert.accept();
	}
	
}
