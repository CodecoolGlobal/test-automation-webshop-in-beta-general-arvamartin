Feature: The user can read description about a product
  As a User, I want to see every product on its own page so that I can get detailed information on the product.
  Scenario Outline: The user can see details about a product
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    And user enters "standard_user" username and "secret_sauce" password
    And user clicks on the login button
    When user clicks on the first product
    Then user can see details of the specific product
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |