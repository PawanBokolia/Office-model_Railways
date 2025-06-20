package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC008_OrderLogin_via_Elavon extends BaseClass{

	@Test
	public void OrderLogin () throws InterruptedException {

		try {
			HomePage hp = new HomePage(driver);		
			hp.acceptCookies();

			Thread.sleep(2000);
			hp.moveOnCategoryScale();

			Thread.sleep(2000);
			hp.moveOnSubCategoryrolling();		

			Thread.sleep(2000);
			hp.clickOnSubCategoryWagon();


			ProductListingPage pl= new ProductListingPage(driver);
			pl.clickOnSingleProduct();

			ProductDetailPage pd = new ProductDetailPage(driver);
			pd.clickOnAddtoCartBtn();

			Thread.sleep(4000);
			hp.clickOnMiniCartBtn();

			CartPage cp = new CartPage(driver);
			cp.clickOnCheckoutBtn();

			CheckOutPage checkpg= new CheckOutPage(driver);

			Thread.sleep(2000);
			checkpg.emailInputFild("pawan.bokoliaqa@gmail.com");

			Thread.sleep(4000);
			checkpg.passwordInputField("Pawanbokolia@95");

			checkpg.clickOnLoginBtn();

			Thread.sleep(10000);
			//		checkpg.nameInputField();


		}
		catch(Exception e )
		{
			System.out.println(e.getMessage());
			Assert.assertTrue(false);	
		}
		
		//need to be completed
		


	}







}