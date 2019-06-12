package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {

	// Declaration
	private WebDriver driver;
	
	@FindBy(xpath="//div[.='USERS']")
	private WebElement userLink;
	
	// Initialization
	public HomePage1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public UserPage1 clickUser(){
		userLink.click();
		return new UserPage1(driver);
	}
	

}
