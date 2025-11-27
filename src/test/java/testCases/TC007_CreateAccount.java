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
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSignInbtn();
		
		
		LoginAndCreateAccPage accPg = new LoginAndCreateAccPage();
		accPg.clickOnCreateAccbtn();
		accPg.fillEmailfield(faker.randomEmail());
		accPg.clickOnNewsCheckBox();	
		accPg.fillNameField("test");
		accPg.fillLastnameField("Chilliapple");
		accPg.fillteleField(faker.randomPhoneNum());
		accPg.fillmobileField(faker.randomPhoneNum());
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
		MyAccPage mp = new MyAccPage();
		String verify = mp.verifyUniversalMsg();
		
		Assert.assertEquals(verify, "Thank you for registering with Model Railways Direct Ltd.");
		
		
	}
}
