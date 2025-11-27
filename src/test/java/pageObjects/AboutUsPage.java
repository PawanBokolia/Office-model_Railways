package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

	public AboutUsPage( ) 
	{
		super();
	}

	@FindBy(xpath="//h2[normalize-space()='About Us']")
	WebElement aboutustitle;
	
	public String verifyAboutusTitle()
	{
		return aboutustitle.getText();
	}




}