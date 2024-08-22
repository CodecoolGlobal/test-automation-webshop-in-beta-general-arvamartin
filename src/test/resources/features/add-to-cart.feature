Feature: add products to cart
  As a User, I want to put products into the cart so that I can buy them.

  Scenario Outline: Products can be added to cart
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    And user clicks on add to cart button for a product
    And user clicks on add to cart button for another product
    Then user sees two products on the shopping cart icon
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |
