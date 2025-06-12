package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{


	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions act = new Actions(driver);
	

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//cookies
	@FindBy(css="button[id='btn-cookie-allow']")
	WebElement cookies;
	

	@FindBy(xpath="//div[@class='panel header']//li[@data-label='or']//a")
	WebElement signInbtn;

	@FindBy(xpath="//div[@class='panel header']//button")
	WebElement loginbtnmega;

	@FindBy(xpath="//li[@class='customer-welcome active']//div[@class='customer-menu']//li[3]")
	WebElement signOutbtn;

	@FindBy(xpath="//span[@class='base']")
	WebElement signOutMessage;

	@FindBy(id="newsletter")
	WebElement newsLetter;

	@FindBy(css="button[title='Subscribe']")
	WebElement newsLettersubBtn;

	@FindBy(css="a[class='mega first has-child dynamic-width style-tabs active']")
	WebElement newsVerificationMsg;

	@FindBy(linkText="Contact us")
	WebElement contactUslink;

	@FindBy(xpath="//span[normalize-space()='About Us']")
	WebElement aboutusBTN;

	
	//menu 
	@FindBy(xpath="//a[@class='mega first has-child dynamic-width style-tabs']//span")
	WebElement categoryScale;

	@FindBy(linkText="Rolling Stock & Accessories")
	WebElement subCategoryRolling;
	
	@FindBy(linkText="Wagon Loads & Containers")
	WebElement subCategoryWagon;
	
	//cookies
	public void acceptCookies()
	{
		try 
		{
			if(cookies.isDisplayed())
			{
				cookies.click();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void clickOnSignInbtn()
	{
		signInbtn.click();
	}


	public String verifLogin()
	{
		loginbtnmega.click();
		return loginbtnmega.getText();

	}

	public void clickOnSignOut()
	{
		signOutbtn.click();
	}

	public String verifySignOut()
	{
		return signOutMessage.getText();
	}

	public void newsletterInput(String input)
	{
		newsLetter.sendKeys(input);

	}

	public void clickOnNewsSubBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(newsLettersubBtn)).click();
	}

	public String  newsVerifMsg()
	{
		return newsVerificationMsg.getText();
	}

	public void clickOnContUS()
	{
		js.executeScript("arguments[0].click();", contactUslink);
	}

	public void clickOnAboutUs()
	{
		js.executeScript("arguments[0].click();",aboutusBTN);
	}
	
	public void moveOnCategoryScale()
	{
		act.moveToElement(categoryScale).perform();
	}
	
	public void moveOnSubCategoryrolling()
	{
		act.moveToElement(subCategoryRolling).perform();
	}
	
	public void clickOnSubCategoryWagon()
	{
		act.moveToElement(subCategoryWagon).click().perform();
	}
	

}
