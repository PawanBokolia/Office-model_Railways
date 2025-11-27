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
		
			HomePage hp = new HomePage();		
			hp.acceptCookies();
			hp.moveOnCategoryScale();
			hp.moveOnSubCategoryrolling();		
			hp.clickOnSubCategoryWagon();


			ProductListingPage pl= new ProductListingPage();
			pl.clickOnQuickViewBtn();

			Thread.sleep(3000);
			boolean verify =pl.checkQuickViewPopUp();
			Assert.assertTrue(verify);
			
		}

}

