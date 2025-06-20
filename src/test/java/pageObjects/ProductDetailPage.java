package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends BasePage{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ProductDetailPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css=".action.primary.tocart")
	WebElement addtocartbtn;

	@FindBy(xpath="//div[@class='product-addto-links']//a[1]")
	WebElement wishListBtn;
	
	@FindBy(xpath="//div[@class='product-addto-links']//a[2]")
	WebElement compareBtn;
	
	
	
	
	public void clickOnAddtoCartBtn()
	{
		js.executeScript("arguments[0].click();", addtocartbtn);
	}

	
	public void clickOnWishListBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(wishListBtn));
		wishListBtn.click();
	}
	
	public void clickOnCompareBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(compareBtn));
		wishListBtn.click();
	}
}
