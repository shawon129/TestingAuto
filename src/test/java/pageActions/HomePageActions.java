package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocators.HomePageLocators;
import pageTest.TestBase;

public class HomePageActions {
	
	
	HomePageLocators homePageLocators = null;
	
	public HomePageActions() {
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(TestBase.getDriver(), homePageLocators);
	}
	
	
	public void gotoSignInPage() {
		WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOf(homePageLocators.signInBtn));
		homePageLocators.signInBtn.click();
		
		wait.until(ExpectedConditions.visibilityOf(homePageLocators.signInLink));		
		homePageLocators.signInLink.click();
		
	}

}
