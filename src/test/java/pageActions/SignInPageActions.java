package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocators.SignInPageLocators;
import pageTest.TestBase;

public class SignInPageActions {

	
	SignInPageLocators signInPageLocators = null;
	
	public SignInPageActions() {
		signInPageLocators = new SignInPageLocators();
		PageFactory.initElements(TestBase.getDriver(), signInPageLocators);
	}
	
	public void provideSignInInput(String email) {
		WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOf(signInPageLocators.emailInput));

		signInPageLocators.emailInput.clear();
		signInPageLocators.emailInput.sendKeys(email);
		
	}
}
