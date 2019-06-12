package automation2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//this class is POM class
public class Demo2Page {
	
	// Declaration
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	// Initialization
	public Demo2Page(WebDriver driver){
		PageFactory.initElements(driver, this);     //initElements() accept 2 arguments: WebDriver , current class object ref variable
	}
	
	// Utilization
	public int getLinkCount(){
		int count = allLinks.size();
		return count;
	}
	

}
