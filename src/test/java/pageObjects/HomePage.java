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
	WebElement loginsection;



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

	//mini cart
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement minicartbtn;

	@FindBy(xpath="//div[@id='ui-id-1']")
	WebElement miniCartpopup;

	@FindBy(xpath="//a[@class='action viewcart']")
	WebElement miniCartCartBtn;
	
	//Search
	@FindBy(id="search")
	WebElement searchBar;
	
	@FindBy(css="li.mst-searchautocomplete__item.magento_catalog_product")
	WebElement searchResult;
	
	@FindBy(css="span.sku")
	WebElement skuValue;
	
	
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


	//login section pop up
	public void clickOnSignInbtn()
	{
		loginsection.click();
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
		wait.until(ExpectedConditions.visibilityOf(categoryScale));
		act.moveToElement(categoryScale).perform();
	}

	public void moveOnSubCategoryrolling()
	{
		wait.until(ExpectedConditions.visibilityOf(subCategoryRolling));
		act.moveToElement(subCategoryRolling).perform();
	}

	public void clickOnSubCategoryWagon()
	{
		wait.until(ExpectedConditions.visibilityOf(subCategoryWagon));
		js.executeScript("arguments[0].click();", subCategoryWagon);
	}

	
	//mini cart
	public void clickOnMiniCartBtn()
	{

		wait.until(ExpectedConditions.elementToBeClickable(minicartbtn));
		minicartbtn.click();

		if(miniCartpopup.isDisplayed() && miniCartpopup.isEnabled()==true)
		{
			miniCartCartBtn.click();
		}
	}

	//Search
	public void enterTextOnSearchBar(String text)
	{
		searchBar.clear();
		searchBar.sendKeys(text);
	}

	public boolean verifySearchResult()
	{
		wait.until(ExpectedConditions.visibilityOf(searchResult));
		return searchResult.isDisplayed();
	}

	public String verifySkuInSearch()
	{
		return skuValue.getText();
	}
	

}



