package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutUsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC004_AboutUs extends BaseClass{
	
	@Test
	public void AboutUs() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		hp.clickOnAboutUs();
		
		Thread.sleep(3000);
		
		AboutUsPage ap= new AboutUsPage(driver);
		String verifypage = ap.verifyAboutusTitle();
		
		Assert.assertEquals(verifypage, "About Us");
		
	}

}
