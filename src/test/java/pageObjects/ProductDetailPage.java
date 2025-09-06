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
	
	@FindBy(xpath="a[class='action tocompare'][data-role='add-to-links']")
	WebElement compareBtn;
	
	
	
	
	public void clickOnAddtoCartBtn()
	{
		js.executeScript("arguments[0].click();", addtocartbtn);
	}

	
	public void clickOnWishListBtn()
	{
		js.executeScript("arguments[0].click();",wishListBtn);
//		wishListBtn.click();
	}
	
	public void clickOnCompareBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(compareBtn));
		compareBtn.click();
	}
}
