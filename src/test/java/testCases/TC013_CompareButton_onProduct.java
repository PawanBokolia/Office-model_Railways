package testCases;

import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC013_CompareButton_onProduct extends BaseClass{
	
	public void CompareButton_onProduct() throws InterruptedException
	{
		HomePage hp = new HomePage();		
		hp.acceptCookies();

		hp.clickOnSignInbtn();

		LoginAndCreateAccPage lg = new LoginAndCreateAccPage();
		lg.login(p.getProperty("username"), p.getProperty("password"));

		hp.moveToWagonLoads();

		ProductListingPage pl= new ProductListingPage();
		pl.clickOnSingleProduct();

		ProductDetailPage pd = new ProductDetailPage();
		
		pd.clickOnCompareBtn();
		
		Thread.sleep(3000);
		MyAccPage mp = new MyAccPage();
		String verify2 = mp.verifyUniversalMsg();
		
		Assert.assertEquals(verify2, "You added product BD Large Containers BR Bauxite & BR Crimson to the comparison list.");
		Reusable_Screenshots.Screenshots("TC013_CompareButton_onProduct");
	}
	
}
