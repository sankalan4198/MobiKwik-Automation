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
import org.example.pages.LoginPage;
import org.example.stepdefs.Hooks;

public class LoginPageStepDef {
    //private WebDriver driver;
    private LoginPage loginPage;
    WebDriver driver=Hooks.driver;

    /*
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }*/


    @Given("I am on the Mobikwik page")
    public void I_am_on_the_Mobikwik_page() {
        driver.get("https://www.mobikwik.com/");
        loginPage = new LoginPage(driver);

    }

    @Given("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I enter my phone number and enter the OTP")
    public void enter_phoneNumber() throws InterruptedException {
        loginPage.enterPhoneNumber("9832496336");
        Thread.sleep(15000);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() throws InterruptedException {
        loginPage.loginPage();
        Thread.sleep(8000);
    }




}
