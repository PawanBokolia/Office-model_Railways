package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC008_OrderLogin_via_Elavon extends BaseClass {

    @Test
    public void OrderLogin() throws InterruptedException {

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

        Thread.sleep(4000);
        checkpg.passwordInputField("Pawanbokolia@95");

        checkpg.clickOnLoginBtn();

        Thread.sleep(3000);
        checkpg.selectShipingMethod();

        Thread.sleep(3000);
        checkpg.selectElavonOption();

        Thread.sleep(3000);
        checkpg.clickOnOrderPlaceBtn();

        Thread.sleep(5000);

        WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"sagepaysuiteserver_embed_low\"]"));
        driver.switchTo().frame(frame);

        checkpg.enterCardNo("4929000000006");
        checkpg.enterExipreMonth("02");
        checkpg.enterExipreYear("28");
        checkpg.enterCVV("123");
        checkpg.clickOnProceedBtn();

        Thread.sleep(4000);

        checkpg.inputChallengeField("challenge");
        checkpg.clickOnNextButton();

        driver.switchTo().defaultContent();

        String conf = checkpg.orderConfirmMsg();
        Assert.assertEquals(conf, "Thank you for your purchase!");


    }


}