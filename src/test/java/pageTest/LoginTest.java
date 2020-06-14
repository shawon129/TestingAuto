package pageTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelUtil;

public class LoginTest extends TestBase {

	
	@Test(priority=0, dataProvider = "data")
	public void validateSignIn(String email) {		
		TestBase.homePageActions = TestBase.homePageActionsObject();
		TestBase.signInPageActions = TestBase.signInPageActionsObject();
		
		homePageActions.gotoSignInPage();
		signInPageActions.provideSignInInput(email);
		TestBase.getDriver().navigate().back();
	}
	@DataProvider(name="data")
	public Object[][] testData(){
		
		return new Object[][] { {"expample@gmail.com"}, {"2nd@mail.com"} };
	}

}
