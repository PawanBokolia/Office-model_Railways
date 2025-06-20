package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC009_QuickViewIsPresent extends BaseClass {

	@Test
	public void quickView() throws InterruptedException
	{
		
			HomePage hp = new HomePage(driver);		
			hp.acceptCookies();

			Thread.sleep(2000);
			hp.moveOnCategoryScale();

			Thread.sleep(2000);
			hp.moveOnSubCategoryrolling();		

			Thread.sleep(2000);
			hp.clickOnSubCategoryWagon();


			ProductListingPage pl= new ProductListingPage(driver);
			pl.clickOnQuickViewBtn();

			Thread.sleep(3000);
			boolean verify =pl.checkQuickViewPopUp();
			Assert.assertTrue(verify);
			
		}

}

