package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class Megamenucheck extends BaseClass{

	@Test
	public void test1() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.acceptCookies();
		
		Thread.sleep(2000);
		hp.moveOnCategoryScale();
		hp.moveOnSubCategoryrolling();
		hp.clickOnSubCategoryWagon();
		
	}
}
