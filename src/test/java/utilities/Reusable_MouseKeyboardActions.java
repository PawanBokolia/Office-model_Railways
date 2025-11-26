package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reusable_MouseKeyboardActions {

	public Actions act;
	
	public Reusable_MouseKeyboardActions(WebDriver driver)
	{
		this.act = new Actions(driver);
	}
	
	public void mouseClick(WebElement element)
	{
		act.moveToElement(element).click().perform();
	}

	public void mouseHover(WebElement element)
	{
		act.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element)
	{
		act.doubleClick(element).perform();
	}

	public void rightClick(WebElement element)
	{
		act.contextClick(element).perform();
	}

	public void dragAndDrop(WebElement element, WebElement element2)
	{
		act.dragAndDrop(element,element2).perform();
	}

	public void ctrlKeyAction(String key)
	{
		act.keyDown(Keys.CONTROL).sendKeys(key).keyUp(Keys.CONTROL).perform();
	}
	
	

}
