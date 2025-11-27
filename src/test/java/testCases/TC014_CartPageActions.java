package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC014_CartPageActions extends BaseClass{

	@Test
	public void cartPageActions() throws InterruptedException
	{
		HomePage hp = new HomePage();		
		hp.acceptCookies();
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();		
		hp.clickOnSubCategoryWagon();


		ProductListingPage pl= new ProductListingPage();
		pl.clickOnSingleProduct();

		ProductDetailPage pd = new ProductDetailPage();
		pd.clickOnAddtoCartBtn();

		Thread.sleep(4000);
		hp.clickOnMiniCartBtn();
		
		CartPage cp = new CartPage();
		cp.changeProQuantity("5");
		cp.clickOnUpdateCartBtn();
		
		Thread.sleep(3000);
		String value = cp.checkQuantity();
		Assert.assertEquals(value , "5");
		
		
		
		
	}
}
