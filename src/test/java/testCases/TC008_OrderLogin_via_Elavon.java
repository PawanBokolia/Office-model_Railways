package testCases;

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

			Thread.sleep(4000);
			checkpg.passwordInputField("Pawanbokolia@95");

			checkpg.clickOnLoginBtn();
			
			Thread.sleep(3000);
			checkpg.selectShipingMethod();
			
			Thread.sleep(3000);
			checkpg.selectElavonOption();
			checkpg.clickOnOrderPlaceBtn();
			
			Thread.sleep(6000);
		
			driver.switchTo().frame(0);
			checkpg.enterCardNo("4929000000006");
			checkpg.enterExipreMonth("02");
			checkpg.enterExipreYear("28");
			checkpg.enterCVV("123");
			checkpg.clickOnProceedBtn();
			
			
			
			
			
		


	}







}