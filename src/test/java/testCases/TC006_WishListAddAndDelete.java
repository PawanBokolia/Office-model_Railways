package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.ProductListingPage;
import pageObjects.WishListPage;
import testBase.BaseClass;

public class TC006_WishListAddAndDelete extends BaseClass{

	@Test
	public void WishListAddAndDelete() throws InterruptedException
	{
		
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		
		LoginAndCreateAccPage lg = new LoginAndCreateAccPage(driver);
		lg.enterEmailField("pawan.bokoliaqa@gmail.com");
		lg.enterPassword("Pawanbokolia@95");
		lg.clickOnLoginBtn();
		
		Thread.sleep(2000);
		hp.moveOnCategoryScale();

		Thread.sleep(2000);
		hp.moveOnSubCategoryrolling();
		
		Thread.sleep(2000);
		hp.clickOnSubCategoryWagon();

		Thread.sleep(2000);
		ProductListingPage pl= new ProductListingPage(driver);
		
		pl.clickOnWishListBtn();
		
		WishListPage wl= new WishListPage(driver);
		Thread.sleep(3000);
		String msg = wl.verifyWishListMsg();
		Assert.assertEquals(msg, "BD Large Containers BR Bauxite & BR Crimson has been added to your Wish List. Click here to continue shopping.");
		
		Thread.sleep(3000);
		wl.ClickOnAllDeleteBtn();
	}
	
	
	
	
	
	
}
