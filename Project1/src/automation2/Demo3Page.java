package automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//this class is POM class
public class Demo3Page {
	
	// Declaration
	@FindBy(xpath="(//button)[2]")
	private WebElement closeLink;
	
	// Initialization
	public Demo3Page(WebDriver driver){
		PageFactory.initElements(driver, this);     //initElements() accept 2 arguments: WebDriver , current class object ref variable
	}
	
	// Utilization
	public void clickClose(){
		closeLink.click();
	}
	

}
