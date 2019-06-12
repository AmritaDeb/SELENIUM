package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
	private WebDriver driver;
	@FindBy(xpath="//div[.='USERS']")
	private WebElement userLink;
	
	// Initialization
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public void clickUser(){
		userLink.click();
	}
	

}
