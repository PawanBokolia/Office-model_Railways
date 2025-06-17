package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccPage extends BasePage {

	public MyAccPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class='panel header']//button")
	WebElement loginbtnmega;
	
	@FindBy(xpath="//div[@data-bind=\"scope: 'messages'\"]")
	WebElement CreateCustomerMsg;
	
	
	
	
	
	public String verifLogin()
	{
		loginbtnmega.click();
		return loginbtnmega.getText();

	}
	
	public String verfyCreateCustomer()
	{
		return CreateCustomerMsg.getText();
	}
	
	
	
}
