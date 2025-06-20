package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC012_WishListAndCompareBtn_onProduct extends BaseClass{

	@Test
	public void buttonOnproductPage() throws InterruptedException {
	try {
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

			ProductListingPage pl= new ProductListingPage(driver);
			pl.clickOnSingleProduct();

			ProductDetailPage pd = new ProductDetailPage(driver);
			pd.clickOnWishListBtn();

			MyAccPage mp = new MyAccPage(driver);
			String  verify = mp.verifyUniversalMsg();

			Assert.assertEquals(verify,"BD Large Containers BR Bauxite & BR Crimson has been added to your Wish List. Click here to continue shopping.");

			driver.navigate().back();

			pd.clickOnCompareBtn();

			String verify2 = mp.verifyUniversalMsg();
			Assert.assertEquals(verify2, "You added product BD Large Containers BR Bauxite & BR Crimson to the comparison list.");

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}




	}
}
