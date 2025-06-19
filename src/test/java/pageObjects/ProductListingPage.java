package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListingPage extends BasePage{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ProductListingPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css="a[class='action tocompare']")
	List<WebElement> compareBTNS;

	//compare button 
	@FindBy(css=".action.compare.primary")
	WebElement comparelistBtn;

	//compare button list 
	@FindBy(xpath="//span[@class='base']")
	WebElement compareVerifymsg;

	@FindBy(id="compare-clear-all")
	WebElement CompareClearbtn;

	//pop click on OK button
	@FindBy(css=".action-primary.action-accept")
	WebElement acceptClearCompare;

	//clear compare list message
	@FindBy(xpath= "//div[@data-bind=\"scope: 'messages'\"]")
	WebElement verfyMsg;

	@FindBy(css="a[title='Add to Wish List']")
	List<WebElement> wishListBtn;

	@FindBy(xpath="//span[@class='product-image-wrapper']")
	List<WebElement> products;

		
	public void clickOnCompareBtn()
	{

		compareBTNS.get(0).click();
	}

	public void clickOnCompareListBtn()
	{
		js.executeScript("arguments[0].click();", comparelistBtn);	
	}

	public String verificationComareMsg()
	{
		return compareVerifymsg.getText();
	}

	public void clickOnClearBtn()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(CompareClearbtn)).click();
	}

	public void clickOnOkbtnPopUp()
	{
		wait.until(ExpectedConditions.elementToBeClickable(acceptClearCompare)).click();
	}

	public String verfiyClearComparisonList()
	{
		return verfyMsg.getText();
	}

	public void clickOnWishListBtn()
	{
		wishListBtn.get(0).click();
	}

	public void clickOnSingleProduct()
	{
		if(products.get(0).isDisplayed() && products.get(0).isEnabled())
		{
			products.get(0).click();	
		}
		
	}
}

