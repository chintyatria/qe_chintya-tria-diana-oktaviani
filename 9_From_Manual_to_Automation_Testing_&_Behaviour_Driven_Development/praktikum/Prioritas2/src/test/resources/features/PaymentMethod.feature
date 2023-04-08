Feature: payment
  As a user
  I want to checkout my cart
  So that I can pay my cart

  Scenario: As a user i have be able to pay my cart
    Given I am on the payment method page
    When I choose a payment method
    And I click bayar sekarang button
    Then Transaction success and being processed