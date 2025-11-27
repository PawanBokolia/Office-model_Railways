package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC002_Newsletter extends BaseClass{

	@Test
	public void Newsletter() throws InterruptedException
	{
		try {
			
			HomePage hp = new HomePage();
			hp.acceptCookies();
			hp.newsletterInput(faker.randomEmail());

			Thread.sleep(3000);
			hp.clickOnNewsSubBtn();

			String verfiymsg = hp.newsVerifMsg();

			Thread.sleep(3000);
			Assert.assertEquals(verfiymsg, "Thank you for your subscription.");
		}
		catch(Exception e )
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}


}
