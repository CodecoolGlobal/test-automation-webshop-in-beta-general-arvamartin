Feature: User login


  Scenario Outline: Successful login with valid credentials
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters "<username>" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    Then user is on the desired "https://www.saucedemo.com/inventory.html" page
    Examples:
      | browser | username        |
      | edge    | standard_user   |
      | chrome  | visual_user     |


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