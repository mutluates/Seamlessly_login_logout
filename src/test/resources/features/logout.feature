@logout

Feature: Seamlessly app logout feature
  User story :
  As a user, I should be able to log out.

  @SEAMLES-1979
  Scenario: User can log out and ends up in login page
    Given user is on the homepage of Seamlessly web app
    When click on the user profile
    And see the dropdown menu
    And click on Log out button
    Then user should see logging out from homepage

  @SEAMLES-1980
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    Given user is on the homepage and logout
    When click on the step back button
    Then user should see not going to homepage again