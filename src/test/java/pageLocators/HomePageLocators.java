package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//button//span[text()='Sign In']")
	public WebElement signInBtn;

	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement signInLink;
	
}
