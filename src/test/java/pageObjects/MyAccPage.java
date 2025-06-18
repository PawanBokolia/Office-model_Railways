package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccPage extends BasePage {

	public MyAccPage(WebDriver driver) {
		super(driver);
	}
	
	//text capture "My Account" 
	@FindBy(xpath="//span[@class='base']")
	WebElement loginbtnmega;
	
	@FindBy(css="div[class='panel header'] button[type='button']")
	WebElement toploginmenu;
	
	
	@FindBy(xpath="//div[@data-bind=\"scope: 'messages'\"]")
	WebElement CreateCustomerMsg;
	
	
	
	
	
	public String verifLogin()
	{
		return loginbtnmega.getText();
	}
	
	public String verfyCreateCustomer()
	{
		return CreateCustomerMsg.getText();
	}
	
	public void clickonloginmenu()
	{
		toploginmenu.click();
	}
	
	
}
