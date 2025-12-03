package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	
	public ContactUsPage() 
	{
		super();
	}

	@FindBy(id="name")
	WebElement namefield;

	@FindBy(id="email")
	WebElement emailfield;

	@FindBy(id="telephone")
	WebElement teleField;

	@FindBy(id="comment")
	WebElement commentField;

	@FindBy(xpath="//button[@title='Submit']")
	WebElement submitBTN;

	@FindBy(xpath="//div[@data-bind=\"scope: 'messages'\"]")
	WebElement verifyMSG;

	public void inputUserfield(String name)
	{
		namefield.sendKeys(name);
	}

	public void inputEmailField(String email)
	{
		emailfield.sendKeys(email);
	}


	public void inputTeleField(String phone)
	{
		teleField.sendKeys(phone);
	}


	public void inputCommentField(String comment)
	{
		commentField.sendKeys(comment);
	}

	public void clickOnSubmitBTN()
	{
		js.jsClick(submitBTN);
	}

	public String VerificationValid()
	{
		return verifyMSG.getText();
	}
	
}
