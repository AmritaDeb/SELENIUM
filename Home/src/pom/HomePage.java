package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Declaration
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userLink;
	
	private WebDriver driver;
	
	//Initialization
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickUserLink(){
		userLink.click();
	}
}
