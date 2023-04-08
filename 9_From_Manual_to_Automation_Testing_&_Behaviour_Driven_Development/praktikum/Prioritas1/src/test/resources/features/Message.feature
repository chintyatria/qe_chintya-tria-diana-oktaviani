Feature: Message Feature on Dashboard Page
  As a user
  I want to communication with another user
  So that I send a message

  Scenario:As a user I have be able write my message to send to my friend
    Given I am on the message feature
    When I click my friend's profile and write some message to send
    And I click send button to sending my message
    Then I can chatting with my friend