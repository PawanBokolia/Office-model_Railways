package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginAndCreateAccPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;

public class TC007_CreateAccount extends BaseClass{

	@Test
	public void CreateAccount() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		
		
		LoginAndCreateAccPage accPg = new LoginAndCreateAccPage(driver);
		accPg.clickOnCreateAccbtn();
		accPg.fillEmailfield("pawan.bokoliaqa"+randomString()+"@gmail.com");
		accPg.clickOnNewsCheckBox();	
		accPg.fillNameField("test");
		accPg.fillLastnameField("Chilliapple");
		accPg.fillteleField("123456789");
		accPg.fillmobileField("321456987");
		accPg.selectDrpCountry("GB");
		
		accPg.searchAddress("Edern");
		
		Thread.sleep(3000);
		accPg.autoAddressField();
		
		Thread.sleep(3000);
		
		accPg.fill1stPassword("PawanBokolia@95");
		accPg.fillPasswordCnf("PawanBokolia@95");
		accPg.clickOnCheckBox();
		Thread.sleep(3000);
		accPg.clickOnContBtn();
		
		Thread.sleep(3000);
		MyAccPage mp = new MyAccPage(driver);
		String verify = mp.verfyCreateCustomer();
		
		Assert.assertEquals(verify, "Thank you for registering with Model Railways Direct Ltd.");
		
		
	}
}
