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
		
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		
		LoginAndCreateAccPage lg = new LoginAndCreateAccPage();
		lg.login(p.getProperty("username"), p.getProperty("password"));
		
		
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();
		hp.clickOnSubCategoryWagon();

		Thread.sleep(2000);
		ProductListingPage pl= new ProductListingPage();
		
		pl.clickOnWishListBtn();
		
		WishListPage wl= new WishListPage();
		Thread.sleep(3000);
		String msg = wl.verifyWishListMsg();
		Assert.assertEquals(msg, "BD Large Containers BR Bauxite & BR Crimson has been added to your Wish List. Click here to continue shopping.");
		
		Thread.sleep(3000);
		wl.ClickOnAllDeleteBtn();
	}
	
	
	
	
	
	
}
