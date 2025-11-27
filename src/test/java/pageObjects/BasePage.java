package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.DriverManager;
import utilities.Reusable_JavaScriptExecutor;
import utilities.Reusable_MouseKeyboardActions;
import utilities.Reusable_waitUtils;

public class BasePage {

	public WebDriver driver;
	public Reusable_JavaScriptExecutor js;
	public Reusable_waitUtils wait;
	public Reusable_MouseKeyboardActions act;
	public BasePage()
	{
		this.driver=DriverManager.getDriver();	
		PageFactory.initElements(driver, this);
		this.js = new  Reusable_JavaScriptExecutor(driver);
		this.wait = new Reusable_waitUtils(driver, 20);
		this.act = new Reusable_MouseKeyboardActions(driver);
	}
	
	
	
}
	