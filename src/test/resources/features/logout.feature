Feature: User can logout
  As a User, I want to log out so that another user can use the application.

  Scenario Outline: Successful logout from the page
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    And user enters "standard_user" username and "secret_sauce" password
    And user clicks on the login button
    When user clicks on the logout button
    Then user is on desired the "https://www.saucedemo.com/" page
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |

  Scenario Outline: The user cannot see the products after logout from the page
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    And user enters "standard_user" username and "secret_sauce" password
    And user clicks on the login button
    When user clicks on the logout button
    Then user cannot see the menu button
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |
