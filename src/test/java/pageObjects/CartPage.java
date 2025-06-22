package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CartPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css="button[title='Go to checkout']")
	WebElement checkoutBtn;

	@FindBy(css="[title='Qty']")
	WebElement quantity;
	
	@FindBy(css="button[title='Update Shopping Cart']")
	WebElement updateCartBtn;
	
	public void clickOnCheckoutBtn()
	{
		if(checkoutBtn.isEnabled())
		{
			checkoutBtn.click();
		}
	}
	
	public void changeProQuantity(String value)
	{
		quantity.clear();
		quantity.sendKeys(value);
	}
	
	public void clickOnUpdateCartBtn()
	{
		updateCartBtn.click();
	}
	
	public String checkQuantity()
	{
		wait.until(ExpectedConditions.visibilityOf(quantity));
		return quantity.getDomAttribute("value");
	}

}
