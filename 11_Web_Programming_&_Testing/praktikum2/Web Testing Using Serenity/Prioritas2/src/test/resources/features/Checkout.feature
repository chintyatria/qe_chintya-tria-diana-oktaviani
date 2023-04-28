@Checkout-Page
Feature: User can checkout their products
  As user
  I want to purchase my cart
  So that I can enjoy my product

  Background:
    Given I am on the checkout page
  Scenario:
    When I choose payment Method
    And I click bayar button
    Then I see payment barcode