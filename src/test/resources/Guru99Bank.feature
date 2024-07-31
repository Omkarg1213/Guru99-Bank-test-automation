Feature: Guru99 Bank Login

  Scenario: Login with valid credentials
    Given the user is on the Guru99 Bank login page
    When the user enters valid UserId and valid Password
    Then the user should be logged in successfully and see the title

  Scenario: Login with invalid UserId and valid Password
    Given the user is on the Guru99 Bank login page
    When the user enters invalid UserId and valid Password
    Then an alert with message should be displayed

  Scenario: Login with valid UserId and invalid Password
    Given the user is on the Guru99 Bank login page
    When the user enters valid UserId and invalid Password
    Then an alert with message should be displayed

  Scenario: Login with invalid UserId and invalid Password
    Given the user is on the Guru99 Bank login page
    When the user enters invalid UserId and invalid Password
    Then an alert with message should be displayed
