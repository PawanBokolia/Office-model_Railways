package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage extends BasePage {


	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ContactUsPage(WebDriver driver) 
	{
		super(driver);
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
		js.executeScript("arguments[0].click();",submitBTN);
	}

	public String VerificationValid()
	{
		return verifyMSG.getText();
	}
	
}
