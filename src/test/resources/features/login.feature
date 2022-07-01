@smoke
Feature: Seamlessly app login page
  User story :  As a user, I should be able to login with correct credentials.
  And dashboard should be displayed.

  @TC1
  Scenario: user can login with correct credentials by clicking on login button
    Given user is on the login page of Seamlessly web app
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should see the dashboard

  @TC2
  Scenario: user can login with correct credentials by pressing the enter key
    Given user is on the login page of Seamlessly web app
    When user enters valid username
    And user enters valid password
    And user press the enter key
    Then user should see the dashboard

  @TC3
  Scenario: user can not login with invalid credentials
    Given user is on the login page of Seamlessly web app
    When user enters invalid username
    And user enters valid password
    And user clicks on login button
    Then user should see Wrong username or password message

  @TC4
  Scenario: user can not login with invalid credentials
    Given user is on the login page of Seamlessly web app
    When user enters valid username
    And user enters invalid password
    And user clicks on login button
    Then user should see Wrong username or password message