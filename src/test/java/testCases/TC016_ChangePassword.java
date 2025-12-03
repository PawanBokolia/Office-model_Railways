package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC016_ChangePassword extends BaseClass {

	@Test
	public void changePassword() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		
		LoginAndCreateAccPage lp = new LoginAndCreateAccPage();
		lp.login(p.getProperty("username"), p.getProperty("password"));
		
		MyAccPage acc = new MyAccPage();	
		acc.clickonloginmenu();
		acc.clickOnMyaccBtn();
		acc.clickOnChangePassword();
		acc.changeCurrentPassword(p.getProperty("password"), p.getProperty("newPassword"), p.getProperty("newPassword"));
		Assert.assertEquals(acc.getConfNewPasswordMg(), "You saved the account information.");
		Reusable_Screenshots.Screenshots("TC016_ChangePassword");
		
		
		
		
		
		
		
		
		
	}
}
