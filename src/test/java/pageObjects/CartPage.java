package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CartPage()
	{
		super();
	}


	@FindBy(css="button[title='Go to checkout']")
	WebElement checkoutBtn;

	@FindBy(css="[title='Qty']")
	WebElement quantity;
	
	@FindBy(css="button[title='Update Shopping Cart']")
	WebElement updateCartBtn;
	
	public void clickOnCheckoutBtn()
	{
		if(checkoutBtn.isEnabled() == true )
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
		wait.elementPresent(quantity);
		return quantity.getDomAttribute("value");
	}

}
