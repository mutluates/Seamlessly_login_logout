@smoke
Feature: Seamlessly app login page
  User story :  As a user, I should be able to login with correct credentials.
  And dashboard should be displayed.

  Background: user is on the login page
    Given user is on the login page of Seamlessly web app

  Scenario: user can login with correct credentials
    When user enters librarian username
    And user enters librarian password
    And user clicks on login button
    Then user should see the dashboard