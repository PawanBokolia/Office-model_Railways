package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BasePage {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	
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
	
	@FindBy(xpath="//table[@class='table-checkout-shipping-method amcheckout-shipping-methods']//tr//td[1]")
	List<WebElement> shipingMethod;
	
	@FindBy(id="sagepaysuiteserver")
	WebElement elavonPayment;
	
	@FindBy(css=".action.primary.checkout.amasty")
	WebElement orderPlaceBtn;
	
	//i frame
	@FindBy(xpath="//iframe[@class=\"sagepaysuiteserver_embed_low\"]")
	WebElement cardNo;
	
	@FindBy(name="expirymonth")
	WebElement expireMnth;
	
	@FindBy(name="expiryyear")
	WebElement expireYear;
	
	@FindBy(name = "securitycode")
	WebElement cvv;
	
	@FindBy(xpath="//button[@value='proceed']")
	WebElement proceedBtn;
	
	
	
	public void emailInputFild(String email )
	{
		emailAddress.sendKeys(email);
//		emailAddress.sendKeys(Keys.ENTER);
	}
	
	public void passwordInputField(String pwd)
	{
		if(passwordfield.isDisplayed() && passwordfield.isEnabled()== true)
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
	
	public void selectShipingMethod()
	{
		shipingMethod.get(0).click();
	}
	
	public void selectElavonOption()
	{
		wait.until(ExpectedConditions.elementToBeClickable(elavonPayment));
		elavonPayment.click();
	}
	
	public void clickOnOrderPlaceBtn()
	{
		orderPlaceBtn.click();
	}
	
	public void enterCardNo(String cardno)
	{
		cardNo.sendKeys(cardno);
	}
	
	public void enterExipreMonth(String expire)
	{
		expireMnth.sendKeys(expire);
	}
	
	public void enterExipreYear(String year)
	{
		expireYear.sendKeys(year);
	}
	
	public void enterCVV(String cvv)
	{
		expireYear.sendKeys(cvv);
	}
	
	public void clickOnProceedBtn()
	{
		proceedBtn.click();
	}
	
}
