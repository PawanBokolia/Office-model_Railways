package testCases;


import org.testng.annotations.Test;
import pageObjects.*;
import testBase.BaseClass;

public class TC017_CheckOut extends BaseClass {

    @Test
    public void heckOut() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.acceptCookies();
        hp.moveOnCategoryScale();
        hp.moveOnSubCategoryrolling();
        hp.clickOnSubCategoryWagon();

        ProductListingPage pl = new ProductListingPage(driver);
        pl.clickOnSingleProduct();

        ProductDetailPage pd = new ProductDetailPage(driver);
        pd.clickOnAddtoCartBtn();

        Thread.sleep(3000);
        hp.clickOnMiniCartBtn();

        CartPage cp = new CartPage(driver);
        cp.clickOnCheckoutBtn();

        CheckOutPage checkpg = new CheckOutPage(driver);

        Thread.sleep(2000);
        checkpg.emailInputFild("pawan.bokoliaqa@gmail.com");
        checkpg.nameInputField("test");
        checkpg.lastnameInputfield("ChilliApple");
        checkpg.inputSearchAddressField("test");

        Thread.sleep(3000);
        checkpg.selectAddressResult();
        checkpg.inputTelField("123456789");

        Thread.sleep(4000);
        checkpg.selectShipingMethod();

        Thread.sleep(3000);
        checkpg.selectPayPalRadioBtn();

        Thread.sleep(3000);
        checkpg.clickOnPayPalLink();

        Thread.sleep(5000);


    }
}
