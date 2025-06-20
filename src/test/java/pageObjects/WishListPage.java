package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage extends BasePage{


	public WishListPage(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath="//div[@data-bind=\"scope: 'messages'\"]")
	WebElement verifyMsg;

	@FindBy(xpath="(//a[@title='Remove Item'])[i]")
	List<WebElement> deletebtn;


	public String verifyWishListMsg()
	{
		return verifyMsg.getText();
	}

	public void ClickOnAllDeleteBtn() throws InterruptedException
	{



		
	}
}


