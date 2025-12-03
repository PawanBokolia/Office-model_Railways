package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListingPage extends BasePage{



	public ProductListingPage() {
		super();

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

	@FindBy(xpath="//strong[@class='product name product-item-name']")
	List<WebElement> products;

	@FindBy(xpath="(//a[@class='mpquickview-button'][1])[1]")
	WebElement quickViewBtn;

	@FindBy(id="mpquickview-popup")
	WebElement quickViewPopUp;

	@FindBy(xpath="(//select[@id='limiter'])[1]")
	WebElement productPerPageDrp;

	@FindBy(xpath="(//li[@class='item pages-item-next'])[1]")
	WebElement nextPgBtn;

	public void clickOnCompareBtn()
	{

		compareBTNS.get(0).click();
	}

	public void clickOnCompareListBtn()
	{
		js.jsClick(comparelistBtn);	
	}

	public String verificationComareMsg()
	{
		return compareVerifymsg.getText();
	}

	public void clickOnClearBtn()
	{ 														

		wait.elementClickable(CompareClearbtn);
	}

	public void clickOnOkbtnPopUp()
	{
		wait.elementClickable(acceptClearCompare);
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
		if(products.get(0).isDisplayed() && products.get(0).isEnabled() == true)
		{
			products.get(0).click();	
		}

	}

	public void clickOnQuickViewBtn()
	{
//		act.moveToElement(quickViewBtn).click().perform();
		js.jsClick(quickViewBtn);
	}

	public boolean checkQuickViewPopUp()
	{
		return quickViewPopUp.isDisplayed();
	}

	public void checkProductPerPage()
	{
		Select drp = new Select(productPerPageDrp);
		drp.selectByValue("24");
	}

	public int countProducts()
	{
		return products.size();
	}

	public void clickOneachPage() 
	{
		wait.elementWait(nextPgBtn);
		nextPgBtn.click();
	}



}
