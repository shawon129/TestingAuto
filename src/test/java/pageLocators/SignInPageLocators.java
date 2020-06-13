package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	@FindBy(xpath="//input[@id='EmailAddress']")
	public WebElement emailInput;

}
