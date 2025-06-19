package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends BasePage{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public ProductDetailPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css=".action.primary.tocart")
	WebElement addtocartbtn;

	public void clickOnAddtoCartBtn()
	{
		if(	addtocartbtn.isEnabled() && addtocartbtn.isDisplayed())
		{
			js.executeScript("arguments[0].click();", addtocartbtn);
		}
	}

}
