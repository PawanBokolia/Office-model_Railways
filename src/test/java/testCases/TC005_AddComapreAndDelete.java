package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;
import testBase.DriverManager;

public class TC005_AddComapreAndDelete extends BaseClass{

	@Test
	public void compareAndDelete () throws InterruptedException
	{
		
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();
		hp.clickOnSubCategoryWagon();
		Thread.sleep(2000);
		ProductListingPage pl= new ProductListingPage();
		pl.clickOnCompareBtn();
		
		Thread.sleep(3000);
		pl.clickOnCompareListBtn();
		
		Thread.sleep(3000);
		String msg =pl.verificationComareMsg();
		Assert.assertEquals(msg, "Compare Products");
		

		Thread.sleep(3000);
		DriverManager.getDriver().navigate().back();
		pl.clickOnClearBtn();
		
		Thread.sleep(2000);
		pl.clickOnOkbtnPopUp();
		
		Thread.sleep(3000);
		String verfymsg=pl.verfiyClearComparisonList();
		Assert.assertEquals(verfymsg, "You cleared the comparison list.");
		
			
	}
}
