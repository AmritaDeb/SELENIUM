package sony;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA {

	@Parameters({"city","area"})
	@Test
	public void TestA(@Optional("BNG") String c, @Optional("Magestic") String a){
		Reporter.log(a + " in " + c,true);
	}
}
