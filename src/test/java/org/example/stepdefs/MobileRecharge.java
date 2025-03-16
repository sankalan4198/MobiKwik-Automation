package org.example.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.example.pages.MobileRechageLocators;
import org.example.stepdefs.Hooks;

public class MobileRecharge {
    //private WebDriver driver;
    private MobileRechageLocators mobileRechageLocators;
    WebDriver driver=Hooks.driver;

    @Given("I click on Services & Recharge and Bill payment")
    public void i_click_on_services_recharge_and_bill_payment() throws InterruptedException {
        mobileRechageLocators= new MobileRechageLocators(driver);
        mobileRechageLocators.clickRecharge();


    }
    @When("I fill the details of mobile no and amount")
    public void i_fill_the_details_of_mobile_no_and_amount() {
        mobileRechageLocators.fillDetails("9832496336","10");

    }
    @Then("I confirm for the payment")
    public void i_confirm_for_the_payment() throws InterruptedException {
        mobileRechageLocators.setConfirmPayment();
    }

    @Then("I fill the debit card details and confirm the payment")
    public void fillDebitCrdDetails() throws InterruptedException {
        mobileRechageLocators.setDebitCardNumber("4160210885094238");
    }

    @Then("I check the recharge status")
    public void verifyRechargeStatus() {
        mobileRechageLocators.checkRechargeStatus();
    }


}
