package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC010_ProductPerPage extends BaseClass {

	@Test
	public void productPerPage() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);		
		hp.acceptCookies();
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();		
		hp.clickOnSubCategoryWagon();
		
		ProductListingPage pl= new ProductListingPage(driver);
		
		pl.checkProductPerPage();
		
		Thread.sleep(3000);

		int countOfProduct = pl.countProducts();
	
		if(countOfProduct == 24)
		{
			Assert.assertTrue(true);
		}
		
		
		
		
		
		
		
		
	}
	
}
