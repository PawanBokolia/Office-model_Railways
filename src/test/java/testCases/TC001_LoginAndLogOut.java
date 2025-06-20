package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;

public class TC001_LoginAndLogOut extends BaseClass{


	@Test
	public void loginandLog() throws InterruptedException
	{
			HomePage hp =new HomePage(driver);
			hp.acceptCookies();
			hp.clickOnSignInbtn();

			LoginAndCreateAccPage lg = new LoginAndCreateAccPage(driver);
			lg.enterEmailField("pawan.bokoliaqa@gmail.com");
			lg.enterPassword("Pawanbokolia@95");
			lg.clickOnLoginBtn();

			Thread.sleep(3000);
			
			MyAccPage mp =new MyAccPage(driver);

			mp.clickonloginmenu();
			hp.clickOnSignOut();

			Thread.sleep(2000);
			String text2 = hp.verifySignOut();

			Assert.assertEquals(text2, "You are signed out");
		}



}




