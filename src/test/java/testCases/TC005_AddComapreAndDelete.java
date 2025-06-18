package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC005_AddComapreAndDelete extends BaseClass{

	@Test
	public void compareAndDelete () throws InterruptedException
	{
		
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		
		Thread.sleep(2000);
		hp.moveOnCategoryScale();

		Thread.sleep(2000);
		hp.moveOnSubCategoryrolling();
		
		Thread.sleep(2000);
		hp.clickOnSubCategoryWagon();

		Thread.sleep(2000);
		ProductListingPage pl= new ProductListingPage(driver);
		pl.clickOnCompareBtn();
		
		Thread.sleep(3000);
		pl.clickOnCompareListBtn();
		
		Thread.sleep(3000);
		String msg =pl.verificationComareMsg();
		Assert.assertEquals(msg, "Compare Products");

		driver.navigate().back();

		Thread.sleep(3000);
		pl.clickOnClearBtn();
		
		Thread.sleep(2000);
		pl.clickOnOkbtnPopUp();
		
		Thread.sleep(3000);
		String verfymsg=pl.verfiyClearComparisonList();
		Assert.assertEquals(verfymsg, "You cleared the comparison list.");
		
			
	}
}
