@Login
Feature: User be able to login
  As User
  I want to see home page
  So that I can buy product

  Background:
    Given I am on the login page

  @Valid-User
  Scenario Outline: As user, I want to be able success login
    When I input "<username>" username
    And I input valid password
    And I click login button
    Then I am on the home page
    Examples:
      |username|
      |standard_user|
      |problem_user |

  @Locked-User
  Scenario: As user, I have been locked out
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."

  @Unregistered-Username
  Scenario: As user, I want to login with unregistered username and valid password
    When I input unregistered username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  @Invalid-Password
  Scenario: As user, I want to login with valid username and invalid password
    When I input valid username
    And I input invalid password
    And I click login button
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  @Unregistered-Account
  Scenario: As user, I want to login with invalid username and password
    When I input invalid username
    And I input invalid password
    And I click login button
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  @Without-Password
  Scenario: As user, I want to login with valid username without password
    When I input valid username
    And I click login button
    Then I can see error message "Epic sadface: Password is required"

  @Without-Username
  Scenario: As user, I want to login with valid password without username
    When I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Username is required"

  @Just-Click-Login-Button
  Scenario: As user, I want to login without input any username and password
    When I click login button
    Then I can see error message "Epic sadface: Username is required"