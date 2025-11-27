package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC003_ContactUs extends BaseClass {

	@Test
	public void Contactus() throws InterruptedException {
		
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnContUS();
		
		Thread.sleep(2000);
		ContactUsPage cnt = new ContactUsPage();
		
		cnt.inputUserfield(faker.randomFirstName());
		cnt.inputEmailField(faker.randomEmail());
		cnt.inputTeleField(faker.randomPhoneNum());
		cnt.inputCommentField("This is for testing please ignore");
	
		Thread.sleep(2000);
		cnt.clickOnSubmitBTN();
		
		Thread.sleep(3000);
		String verify = cnt.VerificationValid();
		Assert.assertEquals(verify, "Thanks for contacting us with your comments and questions. We'll respond to you very soon.");
		
	}
	
	
	
	
}
