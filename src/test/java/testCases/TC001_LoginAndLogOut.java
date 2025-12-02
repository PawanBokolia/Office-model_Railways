package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;
import utilities.Reusable_RetryAnalyzer;

public class TC001_LoginAndLogOut extends BaseClass{


	@Test(retryAnalyzer = Reusable_RetryAnalyzer.class ,groups="Login")
	public void loginandLog() throws InterruptedException
	{
			HomePage hp =new HomePage();
			hp.acceptCookies();
			hp.clickOnSignInbtn();

			LoginAndCreateAccPage lg = new LoginAndCreateAccPage();
			lg.login(p.getProperty("username"), p.getProperty("password"));

			Thread.sleep(3000);
			MyAccPage mp =new MyAccPage();

			mp.clickonloginmenu();
			hp.clickOnSignOut();

			Thread.sleep(2000);
			String text2 = hp.verifySignOut();

			Assert.assertEquals(text2, "You are signed out");
		}



}




