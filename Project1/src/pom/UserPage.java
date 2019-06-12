package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	// Declaration	
	private WebDriver driver;
	@FindBy(xpath="//div[.='Add User']")
	private WebElement addUser;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement addFName;
	@FindBy(id="closeUserDataLightBoxBtn")
	private WebElement close;
	private Alert alert;
	
	// Initialization
	public UserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public void clickAddUser(){
		addUser.click();
	}
	public void setFName(String fn){
		addFName.sendKeys(fn);
	}
	public void clickClose(){
		close.click();
	}
	public void clickOkOnAlert(){
		//driver.switchTo().alert().accept();		
		alert.accept();
	}
	public String alertMsg(){
		alert = driver.switchTo().alert();
		String msg =alert.getText();
		return msg;
	}

}
