package pageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageActions.HomePageActions;
import pageActions.SignInPageActions;

public class TestBase {
	
	
	public static WebDriver driver = null;
	
	public static HomePageActions homePageActions;
	public static SignInPageActions signInPageActions;
	
	public static HomePageActions homePageActionsObject() {
		return homePageActions = new HomePageActions();
	}
	public static SignInPageActions signInPageActionsObject() {
		return signInPageActions = new SignInPageActions();
	}

	@BeforeSuite
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./browser/chromedriver_83.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dell.com/en-us");
	}
	@AfterSuite
	public void tearDownBrowser() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
