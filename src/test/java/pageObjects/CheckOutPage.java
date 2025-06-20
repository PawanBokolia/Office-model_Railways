package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath="//input[@id='customer-email']") //live site 
//	WebElement emailAddress;

	@FindBy(id="customer-email")  //demo site 
	WebElement emailAddress;
	
	
	@FindBy(id="customer-password")
	WebElement passwordfield;
	
	@FindBy(css="button.action.login.primary")
	WebElement loginBtn;
	
	@FindBy(xpath="(//input[@name='firstname'])[1]")
	WebElement namefield;
	
	
	
	public void emailInputFild(String email )
	{
		emailAddress.sendKeys(email);
//		emailAddress.sendKeys(Keys.ENTER);
	}
	
	public void passwordInputField(String pwd)
	{
		if(passwordfield.isDisplayed() == true)
		{
			passwordfield.sendKeys(pwd);
		}
	}
	
	public void clickOnLoginBtn()
	{
		if(loginBtn.isEnabled() ==true)
		{
			loginBtn.click();
		}
	}
	
	public void nameInputField()
	{
		js.executeScript("arguments[0].value='pawan.bokoliaqa@gmail.com';",namefield);
	}
	
	
	
}
