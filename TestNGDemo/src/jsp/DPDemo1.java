package jsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo1{
	
	@DataProvider
	public Object[][] getData(){
		Object[][] a =new Object[2][2];
		a[0][0]="UserA";
		a[0][1]=123;
		a[1][0]="UserB";
		a[1][1]=456;
		return a;
	}
	@Test(dataProvider="getData")
	public void cUser(String un, int pw){
		Reporter.log("Create User:" +un+" Pwd:"+pw, true);
	}
}
