Feature: Enter the details to recharge mobile

  As a user after logging in to MobiKwik
  I want to enter the details of mobile number
  to complete the recharge

  Scenario: Enter the mobile details
    Given I click on Services & Recharge and Bill payment
    When  I fill the details of mobile no and amount
    Then  I confirm for the payment
    #And   I fill the debit card details and confirm the payment
    Then  I check the recharge status
