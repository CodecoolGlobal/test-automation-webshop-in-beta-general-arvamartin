Feature: User login


  Scenario Outline: Successful login with valid credentials
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    Then user is on the desired "https://www.saucedemo.com/inventory.html" page
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |


  Scenario Outline: Unsuccessful login with invalid credentials
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters invalid "not-a-valid-username" username
    And user enters invalid "not-a-valid-password" password
    And user clicks on the login button
    Then user is not on the "https://www.saucedemo.com/inventory.html" home page
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |


  Scenario Outline: There is error handling for unsuccessful login
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters invalid "not-a-valid-username2" username
    And user enters invalid "not-a-valid-password2" password
    And user clicks on the login button
    Then user got error message
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |


  Scenario Outline: Unsuccessful login with empty credentials
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters invalid "" username
    And user enters invalid "" password
    And user clicks on the login button
    Then user got error message
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |