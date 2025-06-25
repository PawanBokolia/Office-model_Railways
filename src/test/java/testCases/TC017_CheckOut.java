package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC017_CheckOut extends BaseClass{

	@Test
	public void heckOut() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);		
		hp.acceptCookies();
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();		
		hp.clickOnSubCategoryWagon();
		
		ProductListingPage pl= new ProductListingPage(driver);
		pl.clickOnSingleProduct();
		
		ProductDetailPage pd = new ProductDetailPage(driver);
		pd.clickOnAddtoCartBtn();
		
		Thread.sleep(3000);
		hp.clickOnMiniCartBtn();
		
		CartPage cp = new CartPage(driver);
		cp.clickOnCheckoutBtn();
		
		CheckOutPage checkpg= new CheckOutPage(driver);
		
		Thread.sleep(2000);
		checkpg.emailInputFild("pawan.bokoliaqa@gmail.com");
		checkpg.nameInputField("test");
		checkpg.lastnameInputfield("Chilliapple");
		checkpg.inputSearchAddressField("test");
		
		
	}
}
