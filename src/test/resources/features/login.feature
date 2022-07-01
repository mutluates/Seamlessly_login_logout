@login
Feature: Seamlessly app login feature
  User story :
  As a user, I should be able to login with correct credentials.
  And homepage should be displayed.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page of Seamlessly web app

  @TC1
  Scenario Template: user can login with correct credentials by clicking on login button
    When user enters valid "<username>"
    And user enters correct "<password>"
    And user clicks on login button
    Then user should see the homepage

    Examples: Valid credentials
      | username   | password    |
      | Employee11 | Employee123 |
      | Employee22 | Employee123 |
      | Employee33 | Employee123 |
      | Employee44 | Employee123 |

  @TC2
  Scenario: user can login with correct credentials by pressing the enter key
    When user enters valid username
    And user enters valid password
    And user press the enter key
    Then user should see the homepage

  @TC3
  Scenario: user can not login with invalid username
    When user enters invalid username
    And user enters valid password
    And user clicks on login button
    Then user should see 'Wrong username or password' message

  @TC4
  Scenario: user can not login with invalid password
    When user enters valid username
    And user enters invalid password
    And user clicks on login button
    Then user should see 'Wrong username or password' message

  @TC5
  Scenario: user can not login without username
    When user leave empty username input box
    And user enters valid password
    And user clicks on login button
    Then user should see 'Please fill out this field.' message

  @TC6
  Scenario: user can not login without password
    When user enters valid username
    And user leaves empty password input box
    And user clicks on login button
    Then user should see 'Please fill out this field.'

  @TC7
  Scenario: user can see the password explicitly
    When user enters valid username
    And user enters valid password
    And user click on the eye button
    Then user should see the password explicitly