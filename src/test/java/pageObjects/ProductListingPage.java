package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage extends BasePage{

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
	
	
	public void clickOnCompareBtn()
	{
		compareBTNS.get(0).click();
	}
	
	public void clickOnCompareListBtn()
	{
		comparelistBtn.click();
	}
	
	public String verificationComareMsg()
	{
		return compareVerifymsg.getText();
	}
	
	public void clickOnClearBtn()
	{
		CompareClearbtn.click();
	}
	
	public void clickOnOkbtnPopUp()
	{
		acceptClearCompare.click();
	}
	
	public String verfiyClearComparisonList()
	{
		return verfyMsg.getText();
	}
	
	public void clickOnWishListBtn()
	{
		wishListBtn.get(0).click();
	}
	
}

