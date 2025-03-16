package org.example.pages;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By login = By.xpath("//span[text()='Login']");
    private By phoneNumber_placeholder = By.xpath("//input[@placeholder='Enter Mobile Number']");
    private By getOTP = By.xpath("//span[text()='Get OTP']//parent::button");
    private By submitOTP = By.xpath("//span[text()='Submit OTP']//parent::button");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods

    public void clickLogin()
    {
        WebElement loginButton=driver.findElement(login);
        loginButton.click();
    }

    public void enterPhoneNumber(String phoneNumber)
    {
        WebElement enter_phoneNumber=driver.findElement(phoneNumber_placeholder);
        enter_phoneNumber.sendKeys(phoneNumber);
        WebElement get_OTP= driver.findElement(getOTP);
        get_OTP.click();
    }

    public void loginPage()
    {
        WebElement submit_OTP=driver.findElement(submitOTP);
        submit_OTP.click();
    }
    /*
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void clickForgottenPasswordLink() {
        WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
        forgottenPasswordLink.click();
    }

    public boolean checkForgotPwdLink(){
        return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
    }

    public boolean checkLogoutLink(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }*/

}
