package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccPage extends BasePage {

	public MyAccPage()
	{
		super();
	}
	
	//text capture "My Account" 		//not in use 
	@FindBy(xpath="//span[@class='base']")
	WebElement loginbtnmega;
	
	@FindBy(css="div[class='panel header'] button[type='button']")
	WebElement toploginmenu;
	
	@FindBy(xpath="//div[@data-bind=\"scope: 'messages'\"]")
	WebElement universal_msg;
	
	@FindBy(xpath="//div[@class='customer-menu' and @aria-hidden='false']//a[text()='My Account']")
	WebElement MyaccBtn;
	
	@FindBy(css="a[class='action change-password']")
	WebElement changePasswordBtn;
	
	@FindBy(name="current_password")
	WebElement currentPassFiled;
	
	@FindBy(id="password")
	WebElement newPasswordfield;
	
	@FindBy(name="password_confirmation")
	WebElement confirmPassField;
	
	@FindBy(css="button[title='Save']")
	WebElement saveNewPass;
	
	@FindBy(css="div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement confNewPasswordMsg;
	
	
	public String verifLogin() //not in the use 
	{
		return loginbtnmega.getText();
	}
	
	public String verifyUniversalMsg()
	{
		return universal_msg.getText();
	}
	
	public void clickonloginmenu()
	{
		toploginmenu.click();
	}
	
	public void clickOnMyaccBtn()
	{
		wait.elementClickable(MyaccBtn);
	}

	public void clickOnChangePassword()
	{
		changePasswordBtn.click();
	}

	public void changeCurrentPassword(String currPassWord,String newPassword,String confPassword)
	{
		currentPassFiled.sendKeys(currPassWord);
		newPasswordfield.sendKeys(newPassword);
		confirmPassField.sendKeys(confPassword);
		saveNewPass.click();
		
	}
	
	public String getConfNewPasswordMg()
	{
		return confNewPasswordMsg.getText();
	}

}
