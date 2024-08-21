Feature: User can logout
  As a User, I want to log out so that another user can use the application.

  Scenario: Successful logout from the page

    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    And user enters "standard_user" username and "secret_sauce" password
    When user clicks on the logout button
    Then user is on the "https://www.saucedemo.com/" page