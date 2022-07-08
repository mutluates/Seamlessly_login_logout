@login
Feature: Seamlessly app login feature
  User story :
  As a user, I should be able to login with correct credentials.
  And homepage should be displayed.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page of Seamlessly web app

  @SEAMLES-1948
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

  @SEAMLES-1949
  Scenario: user can login with correct credentials by pressing the enter key
    When user enters valid username
    And user enters valid password
    And user press the enter key
    Then user should see the homepage

  @SEAMLES-1950
  Scenario: user can not login with invalid username
    When user enters invalid username
    And user enters valid password
    And user clicks on login button
    Then user should see 'Wrong username or password' message

  @SEAMLES-1951
  Scenario: user can not login with invalid password
    When user enters valid username
    And user enters invalid password
    And user clicks on login button
    Then user should see 'Wrong username or password' message

  @SEAMLES-1952
  Scenario: user can not login without username
    When user leave empty username input box
    And user enters valid password
    And user clicks on login button
    Then user should see 'Please fill out this field.' message

  @SEAMLES-1953
  Scenario: user can not login without password
    When user enters valid username
    And user leaves empty password input box
    And user clicks on login button
    Then user should see 'Please fill out this field.'

  @SEAMLES-1954
  Scenario: user can see the password explicitly
    When user enters valid username
    And user enters valid password
    And user click on the eye button
    Then user should see the password explicitly

  @SEAMLES-1955
  Scenario: user can go to Reset password page
    When user clicks on 'Forget password' button
    Then user should see 'Reset password' page open

  @SEAMLES-1956
  Scenario: user can see valid placeholders on Username and Password fields
    When user is on the login page of Seamlessly web app
    Then user should see valid placeholders on Username and Password fields

