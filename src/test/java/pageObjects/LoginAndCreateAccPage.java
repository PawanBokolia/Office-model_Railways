package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginAndCreateAccPage extends BasePage{

	public LoginAndCreateAccPage() 
	{
		super();
	}

	//login
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(xpath="//input[@title='Password']")
	WebElement passwordField;
	
	@FindBy(css ="button[class=\"action login primary\"]")
	WebElement loginbtn;
	
	
	//create account page 	
	@FindBy(css="a[class='action create primary']")
	WebElement createAccBtn;
	
	@FindBy(name="email")
	WebElement emailInput;
	
	@FindBy(name="is_subscribed")
	WebElement newsletterbtn;
	
	@FindBy(name="firstname")
	WebElement nameField;
	
	@FindBy(name="lastname")
	WebElement lastNameField;
	
	@FindBy(name="telephone")
	WebElement teleField;
	
	@FindBy(name="mobile_phone")
	WebElement mobileField;
	
	@FindBy(xpath="//select[@title='Country']")
	WebElement countryDrp;
	
	
	//address field for a word
	@FindBy(xpath="//input[@placeholder='Start typing your address']")
	WebElement addressSearchfield;
	
	//result of a word 
	@FindBy(xpath="//ul[@aria-label='Results']//li")
	List<WebElement> resultList;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="password_confirmation")
	WebElement pwdConf;
	
	@FindBy(name="accept_gdpr")
	WebElement acceptCookiesPolicy;
	
	@FindBy(css="button[title='Continue']")
	WebElement contbtn;
	
	
	//forgot password
	@FindBy(css="a[class='action remind']")
	WebElement forgotPwdLink;
	
	@FindBy(css="input#email_address")
	WebElement forgotEmailfield;
	
	@FindBy(css="button.action.submit.primary")
	WebElement forgotContBtn;
	
	
	
	//Login	
	public void login(String email, String password)
	{
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		loginbtn.click();
	}
	
	
	public void clickOnCreateAccbtn()
	{
		createAccBtn.click();
	}
	
	public void fillEmailfield(String email)
	{
		emailInput.sendKeys(email);
	}
	
	public void clickOnNewsCheckBox()
	{
		emailInput.click();
	}
	
	public void fillNameField(String name)
	{
		nameField.sendKeys(name);
	}
	
	public void fillLastnameField(String LastName)
	{
		lastNameField.sendKeys(LastName);
	}
	
	public void fillteleField(String teleNo)
	{
		teleField.sendKeys(teleNo);
	}
	
	public void fillmobileField(String mobileNo)
	{
		mobileField.sendKeys(mobileNo);
	}
	
	public void selectDrpCountry(String value)
	{
		Select drp = new Select(countryDrp);
		drp.selectByValue(value);
	}
	
	public void searchAddress(String address)
	{
		addressSearchfield.sendKeys(address);
	}
	
	public void autoAddressField()
	{
		
		resultList.get(0).click();
	}
	
	public void fill1stPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void fillPasswordCnf(String pwd)
	{
		pwdConf.sendKeys(pwd);
	}

	public void clickOnCheckBox()
	{
		acceptCookiesPolicy.click();
	}
	
	public void clickOnContBtn()
	{
		contbtn.click();
	}
	
	public void clickOnForgotPwd()
	{
		forgotPwdLink.click();
	}
	
	public void inputFrgPwdField(String email)
	{
		forgotEmailfield.sendKeys(email);
	}
	
	public void clickOnForgotContBtn()
	{
		forgotContBtn.click();
	}
	
	
}
