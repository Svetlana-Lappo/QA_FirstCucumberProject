@regression
Feature: Sconto Login Feature
  In order to see the error message

@wrong
  Scenario:Login with wrong password
    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    When I insert user credentials
    |email              |password|
    |pushinkas@gmail.com|j!Eth5RR2e7FW!|
    And I click on the Login button
    Then I should see error message

@negative
Scenario Outline:Login with wrong password
  Given I am on the Homepage
  When I click on the Login icon
  Then I see Login page

  When I insert user credentials
    |email              |password|
    |<email>|<password>|
  And I click on the Login button
  Then I should see error message
  Examples:
    | email             | password     |
    |pushinkas@gmail.com|              |
    |pushinkas@gmail.com|(*&&&&&&&_=)  |