@Login
Feature: User be able to login
  As User
  I want to see home page
  So that I can buy product

  Background:
    Given I am on the landing page
    When I click masuk button

  @Valid-User
  Scenario Outline: As user, I want to be able success login
    And I input "<email>" username
    And I input valid password
    And I click login button
    Then I am on the home page
    Examples:
      |email|
      |chintyaoktaviani53@gmail.com|
      |082245656274 |

  @Unregistered-Username
  Scenario: As user, I want to login with unregistered username and valid password
    And I input unregistered username
    And I input valid password
    And I click login button
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

  @Invalid-Password
  Scenario: As user, I want to login with valid username and invalid password
    And I input valid username
    And I input invalid password
    And I click login button
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

  @Unregistered-Account
  Scenario: As user, I want to login with invalid username and password
    And I input invalid username
    And I input invalid password
    And I click login button
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

