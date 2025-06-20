package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC012_WishListBTn_onProduct extends BaseClass{

	@Test
	public void buttonOnproductPage() throws InterruptedException {
			HomePage hp = new HomePage(driver);		
			hp.acceptCookies();

			hp.clickOnSignInbtn();

			LoginAndCreateAccPage lg = new LoginAndCreateAccPage(driver);
			lg.enterEmailField("pawan.bokoliaqa@gmail.com");
			lg.enterPassword("Pawanbokolia@95");
			lg.clickOnLoginBtn();

			hp.moveOnCategoryScale();
			hp.moveOnSubCategoryrolling();		
			hp.clickOnSubCategoryWagon();

			ProductListingPage pl= new ProductListingPage(driver);
			pl.clickOnSingleProduct();

			ProductDetailPage pd = new ProductDetailPage(driver);
			pd.clickOnWishListBtn();
			
			Thread.sleep(3000);
			MyAccPage mp = new MyAccPage(driver);
			String  verify = mp.verifyUniversalMsg();
			Assert.assertEquals(verify,"BD Large Containers BR Bauxite & BR Crimson has been added to your Wish List. Click here to continue shopping.");

	}
}
