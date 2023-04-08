Feature: dashboard
  As a user
  I want to choose a product
  So that I can purchase a product that i want

  Scenario: As a user i have be able to purchase a product that i want
    Given I am on the dashboard page
    When I choose a product that i want
    And I enter my phone number and select a package
    Then I am on the payment page