package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

	public AboutUsPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='About Us']")
	WebElement aboutustitle;
	
	public String verifyAboutusTitle()
	{
		return aboutustitle.getText();
	}




}
