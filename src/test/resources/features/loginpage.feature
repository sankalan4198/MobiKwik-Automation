Feature: Login to MobiKwik website

  As a user of the Mobikwik
  I want to be able to log in with my account to MobiKwik
  So that I can recharge my mobile account

  Background:
    Given I am on the Mobikwik page

  Scenario: Successful login with OTP
    Given I click on the login button
    When  I enter my phone number and enter the OTP
    Then  I should be logged in successfully

