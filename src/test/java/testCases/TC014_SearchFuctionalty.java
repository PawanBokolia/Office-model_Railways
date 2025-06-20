package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC014_SearchFuctionalty extends BaseClass{
	
	@Test
	public void SearchFuctionalty() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		hp.enterTextOnSearchBar("BD Large Containers BR Bauxite & BR Crimson");
		
		boolean vlaue = hp.verifySearchResult();
		Assert.assertTrue(vlaue);
		
		Thread.sleep(3000);
		
		hp.enterTextOnSearchBar("36-004A");
		
		String skuValue = hp.verifySkuInSearch();
		Assert.assertEquals(skuValue,"36-004A");
		
	
		
	}
}
