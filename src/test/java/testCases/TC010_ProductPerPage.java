package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC010_ProductPerPage extends BaseClass {

	@Test
	public void productPerPage() throws InterruptedException {
		
		HomePage hp = new HomePage();		
		hp.acceptCookies();
		hp.moveToWagonLoads();
		
		ProductListingPage pl= new ProductListingPage();
		
		pl.checkProductPerPage();
		
		Thread.sleep(3000);

		int countOfProduct = pl.countProducts();
	
		if(countOfProduct == 24)
		{
			Assert.assertTrue(true);
		}
		
		Reusable_Screenshots.Screenshots("TC010_ProductPerPage");
		
		
		
		
		
		
		
		
	}
	
}
