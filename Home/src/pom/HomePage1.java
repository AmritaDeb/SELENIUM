package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {

	//Declaration
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userLink;
	
	private WebDriver driver;
	
	//Initialization
	public HomePage1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public UserListPage1 clickUserLink(){
		userLink.click();
		return new UserListPage1(driver);
	}
}
