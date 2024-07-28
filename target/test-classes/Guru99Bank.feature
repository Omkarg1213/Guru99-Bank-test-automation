Feature: Guru99 Bank Login

  Background:
    Given the user is on the Guru99 Bank login page

  Scenario: Successful login with valid UserId and valid Password
    When the user enters valid UserId and valid Password
    Then the user should be logged in successfully and see the title

  Scenario: Unsuccessful login with invalid UserId and valid Password
    When the user enters invalid UserId and valid Password
    Then an alert with message should be displayed

  Scenario: Unsuccessful login with valid UserId and invalid Password
    When the user enters valid UserId and invalid Password
    Then an alert with message should be displayed

  Scenario: Unsuccessful login with invalid UserId and invalid Password
    When the user enters invalid UserId and invalid Password
    Then an alert with message should be displayed
