package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import testBase.BaseClass;

public class TC016_ForgotPassword extends BaseClass{

	@Test
	public void forgotPassword(){
		
		HomePage hp =new HomePage(driver);
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		LoginAndCreateAccPage lg = new LoginAndCreateAccPage(driver);
		lg.clickOnForgotPwd();
		lg.inputFrgPwdField("pawan.bokoliaqa@gmail.com");
		lg.clickOnForgotContBtn();
		
		//needs to be completed
		
		
	}
}
