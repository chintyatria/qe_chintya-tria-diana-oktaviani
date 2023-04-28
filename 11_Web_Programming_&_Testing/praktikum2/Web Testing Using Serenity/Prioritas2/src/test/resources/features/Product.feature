@Choose-Product
Feature: User be able to choose product
  As User
  I want to buy a product
  So that I can select an item

  Background:
    Given I am on the home page

  Scenario: As user, I want to buy an item
    When I select any item
    And I am on the transaction page
    And I input my data
    And I select the price
    Then I am on the checkout page