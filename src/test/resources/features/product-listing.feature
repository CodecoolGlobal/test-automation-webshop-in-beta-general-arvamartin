Feature: Product Listing
  As a User,
  I want to see an ordered list of the available products
  so that I can choose from them.


  Scenario Outline: Product list is displayed
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters invalid "not-a-valid-username" username
    And user enters invalid "not-a-valid-password" password
    And user clicks on the login button
    When user is not on the "https://www.saucedemo.com/inventory.html" home page
    Then user can see the product list
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |