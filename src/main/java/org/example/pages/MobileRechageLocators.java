package org.example.pages;

//import org.testng.Assert;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.utilities.Assert;


public class MobileRechageLocators {
    private WebDriver driver;

    //Locators
    private By services= By.xpath("//span[text()='Services']");
    private By recharge_billPayment= By.xpath("//span[text()='Recharge & Bill Pay']//parent::a");
    private By mobileNumber= By.xpath("//input[@placeholder='Mobile Number']");
    private By amount= By.xpath("//input[@placeholder='Amount']");
    private By confirmPayment= By.xpath("//span[text()='Confirm']//parent::button");
    private By makePayment= By.xpath("//span[text()='Make Payment']//parent::button");

    //Debit Card Locators
    private By debitCardNumber=By.xpath("//input[@placeholder='Enter Credit / Debit Card Number']");
    private By expiryMonth=By.xpath("//input[@id='expiryMonth']//following::div[text()='MM']");
    private By expiryMonth_value= By.xpath("//span[text()='09']");
    private By expiryYear=By.xpath("//ng-select[@placeholder='YY']");
    private By expiryYear_value= By.xpath("//label[text()='Expiry Year']//following::ng-dropdown-panel[@aria-label='Options list']//following::span[text()='2031']");
    private By rechargeSuccessfull= By.xpath("//p[text()='Recharge Successful']");

    public MobileRechageLocators(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRecharge() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement Services=driver.findElement(services);
        Services.click();
        WebElement RechargeBillPayments=driver.findElement(recharge_billPayment);
        RechargeBillPayments.click();
        Thread.sleep(5000);
    }

    public void fillDetails(String mobile, String amt)
    {
        WebElement MobileNumber=driver.findElement(mobileNumber);
        MobileNumber.sendKeys(mobile);
        WebElement Amount = driver.findElement(amount);
        Amount.sendKeys(amt);
        Amount.click();
    }

    public void setConfirmPayment() throws InterruptedException {
        WebElement confirm= driver.findElement(confirmPayment);
        confirm.click();
        Thread.sleep(2000);
        WebElement MakePayment= driver.findElement(makePayment);
        MakePayment.click();
        Thread.sleep(3000);
    }

    public void setDebitCardNumber(String DebitCardNumber) throws InterruptedException {
        WebElement debitNumber= driver.findElement(debitCardNumber);
        debitNumber.sendKeys(DebitCardNumber);
        Thread.sleep(2000);
        WebElement ExpiryMonth=driver.findElement(expiryMonth);
        ExpiryMonth.click();
        Thread.sleep(2000);
        WebElement ExpiryMonth_value=driver.findElement(expiryMonth_value);
        //ExpiryMonth.click();
        Thread.sleep(2000);
        ExpiryMonth_value.click();
        WebElement ExpiryYear= driver.findElement(expiryYear);
        WebElement ExpiryYear_value=driver.findElement(expiryYear_value);
        ExpiryYear.click();
        ExpiryYear_value.click();
    }
    public void checkRechargeStatus()
    {
        WebElement RechargeStatusMsg=driver.findElement(rechargeSuccessfull);
        if(RechargeStatusMsg.isDisplayed())
        {
            System.out.print("Recharge Successful");
        }
        else {
            System.out.print("Recharge Unsuccessful");
        }
    }




}
