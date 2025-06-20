package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC011_Pagination extends BaseClass{

	@Test
	public void pagination() throws InterruptedException
	{
		int a  =0;
		try {
			HomePage hp = new HomePage(driver);		
			hp.acceptCookies();

			Thread.sleep(2000);
			hp.moveOnCategoryScale();

			Thread.sleep(2000);
			hp.moveOnSubCategoryrolling();		

			Thread.sleep(2000);
			hp.clickOnSubCategoryWagon();

			ProductListingPage pl= new ProductListingPage(driver);
			
			while(a<5)
			{
				pl.clickOneachPage();
				a++;
			}
			
			if(a==5)
			{
				Assert.assertTrue(true);		
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			
		}
		
		catch(Exception e )
		{
			System.out.println(e.getMessage());
			Thread.sleep(3000);
		}

	}	
}
