package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_waitUtils {
	
	public WebDriverWait wait;

	public Reusable_waitUtils(WebDriver driver, int time)
	{
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	}

	public void elementClickable(WebElement locator)
	{
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			locator.click();
		}
		catch(Exception e)
		{
			System.out.println("stale element exception");
			wait.until(ExpectedConditions.refreshed((ExpectedConditions.elementToBeClickable(locator)))).click();
		}
	}


	public void elementPresent(WebElement locator)   			 //work normally in POM 
	{
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void elementStale(WebElement locator)  				//if stale happens multiple time
	{
		wait.until(ExpectedConditions.refreshed((ExpectedConditions.elementToBeClickable(locator)))).click();
	}

	
	public void alertAccept(WebElement locator)  				//if stale happens multiple time
	{
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	
	public void alertCancel(WebElement locator)  				//if stale happens multiple time
	{
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
	}
}
