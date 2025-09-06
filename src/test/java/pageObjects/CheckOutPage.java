package pageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckOutPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

//	@FindBy(xpath="//input[@id='customer-email']") //live site 
//	WebElement emailAddress;

    @FindBy(id = "customer-email")  //demo site
    WebElement emailAddress;


    @FindBy(id = "customer-password")
    WebElement passwordfield;

    @FindBy(css = "button.action.login.primary")
    WebElement loginBtn;

    @FindBy(xpath = "(//input[@name='firstname'])[1]")
    WebElement namefield;

    @FindBy(xpath = "(//input[@name='lastname'])[1]")
    WebElement lastnameField;

    @FindBy(xpath = "(//input[@placeholder='Start typing your address'])[1]")
    WebElement searchAddressfield;

    @FindBy(xpath="(//input[@name='telephone'])[1]")
    WebElement telephoneField;


    @FindBy(xpath = "//table[@class='table-checkout-shipping-method amcheckout-shipping-methods']//tr//td[1]")
    List<WebElement> shipingMethod;

    @FindBy(id = "sagepaysuiteserver")
    WebElement elavonPayment;

    @FindBy(css = ".action.primary.checkout.amasty")
    WebElement orderPlaceBtn;

    //i frame
    @FindBy(css = "input[name='cardnumber']")
    WebElement cardNo;

    @FindBy(css = "input[name='expirymonth']")
    WebElement expireMnth;

    @FindBy(name = "expiryyear")
    WebElement expireYear;

    @FindBy(name = "securitycode")
    WebElement cvv;

    @FindBy(xpath = "(//button[@name='action'])[1]")
    WebElement proceedBtn;

    @FindBy(css = "input#cd")
    WebElement clallengefield;

    @FindBy(css = ".button.button4")
    WebElement nextBtn;

    @FindBy(xpath = "//span[@class='base']")
    WebElement orderConfMsg;

    @FindBy(xpath="//ul[@aria-label='Results']//li")
    List<WebElement> addressResult;

    //paypal
    @FindBy(css="input#paypal_express")
    WebElement paypalRadioBox;

    @FindBy(css="div[role='link']")
    WebElement paypalLinkBtn;


    public void emailInputFild(String email) {
        emailAddress.sendKeys(email);
//		emailAddress.sendKeys(Keys.ENTER);
    }

    public void passwordInputField(String pwd) {
        if (passwordfield.isDisplayed() && passwordfield.isEnabled() == true) {
            passwordfield.sendKeys(pwd);
        }
    }

    public void clickOnLoginBtn() {
        if (loginBtn.isEnabled() == true) {
            loginBtn.click();
        }
    }

    public void nameInputField(String name) {
        namefield.sendKeys(name);
    }

    public void lastnameInputfield(String lastname) {
        lastnameField.sendKeys(lastname);
    }

    public void inputTelField(String telephoneNo)
    {
        telephoneField.sendKeys(telephoneNo);
    }

    public void inputSearchAddressField(String address) {
        searchAddressfield.sendKeys(address);
    }

    public void selectShipingMethod() {
        shipingMethod.get(0).click();
    }

    public void selectElavonOption() {
        wait.until(ExpectedConditions.elementToBeClickable(elavonPayment));
        elavonPayment.click();
    }

    public void clickOnOrderPlaceBtn() {
        orderPlaceBtn.click();
    }

    //paypal
    public void selectPayPalRadioBtn()
    {
      js.executeScript("arguments[0].click();",paypalRadioBox);
    }

    public void clickOnPayPalLink()
    {
        paypalLinkBtn.click();
    }

    //Elavon Card details
    public void enterCardNo(String cardno) {
        cardNo.sendKeys(cardno);
    }

    public void enterExipreMonth(String expire) {
        expireMnth.sendKeys(expire);
    }

    public void enterExipreYear(String year) {
        expireYear.sendKeys(year);
    }

    public void enterCVV(String code) {
        cvv.sendKeys(code);
    }

    public void clickOnProceedBtn() {
        proceedBtn.click();
    }

    public void inputChallengeField(String input) {
        clallengefield.sendKeys(input);
    }

    public void clickOnNextButton() {
        nextBtn.click();
    }

    public String orderConfirmMsg() {
        wait.until(ExpectedConditions.visibilityOf(orderConfMsg));
        return orderConfMsg.getText();
    }
    public void selectAddressResult()
    {
        addressResult.get(0).click();
    }


}
