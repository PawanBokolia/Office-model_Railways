package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(css="button[title='Go to checkout']")
	WebElement checkoutBtn;

	public void clickOnCheckoutBtn()
	{
		if(checkoutBtn.isEnabled())
		{
			checkoutBtn.click();
		}
		
	}


}
