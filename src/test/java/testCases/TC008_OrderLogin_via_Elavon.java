package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;
import testBase.DriverManager;

public class TC008_OrderLogin_via_Elavon extends BaseClass {

    @Test
    public void OrderLogin() throws InterruptedException {

        HomePage hp = new HomePage();
        hp.acceptCookies();
        hp.moveToWagonLoads();
        
        logger.info("step1 ");
        ProductListingPage pl = new ProductListingPage();
        pl.clickOnSingleProduct();
        
        logger.info("step2 ");
        ProductDetailPage pd = new ProductDetailPage();
        pd.clickOnAddtoCartBtn();

        logger.info("step3 ");
        Thread.sleep(3000);
        hp.clickOnMiniCartBtn();

        logger.info("step4 ");
        CartPage cp = new CartPage();
        cp.clickOnCheckoutBtn();

        CheckOutPage checkpg = new CheckOutPage();

        logger.info("step5 ");
        Thread.sleep(2000);
        checkpg.emailInputFild("pawan.bokoliaqa@gmail.com");
        
        logger.info("step6 ");
        Thread.sleep(4000);
        checkpg.passwordInputField("Pawanbokolia@95");
        
        logger.info("step7 ");
        checkpg.clickOnLoginBtn();
       
        logger.info("step8 ");
        Thread.sleep(3000);
        checkpg.selectShipingMethod();

        logger.info("step9 ");
        Thread.sleep(3000);
        checkpg.selectElavonOption();
        
        logger.info("step10 ");
        Thread.sleep(3000);
        checkpg.clickOnOrderPlaceBtn();

        Thread.sleep(5000);

//        WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"sagepaysuiteserver_embed_low\"]"));
//        driver.switchTo().frame(frame);

        checkpg.enterCardNo("4929000000006");
        checkpg.enterExipreMonth("02");
        checkpg.enterExipreYear("28");
        checkpg.enterCVV("123");
        checkpg.clickOnProceedBtn();

        Thread.sleep(4000);

        checkpg.inputChallengeField("challenge");
        checkpg.clickOnNextButton();

        DriverManager.getDriver().switchTo().defaultContent();

        String conf = checkpg.orderConfirmMsg();
        Assert.assertEquals(conf, "Thank you for your purchase!");


    }


}