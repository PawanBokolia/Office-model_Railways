package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAndCreateAccPage extends BasePage{

	public LoginAndCreateAccPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(xpath="//input[@title='Password']")
	WebElement passwordField;
	
	@FindBy(css ="button[class=\"action login primary\"]")
	WebElement loginbtn;
	
	public void enterEmailField(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginBtn()
	{
		loginbtn.click();
	}
}
