Feature: check-out
  As a User, I want to check out so that I can finish shopping.

  Scenario Outline: user can check out with the contents of the cart
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    And user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    And user clicks on add to cart button for a product
    And user clicks on add to cart button for another product
    When user clicks on the shopping cart icon
    And user clicks on the checkout button
    And user enters "test" as first name
    And user enters "test1" as last name
    And user enters "1111" as postal code
    And user clicks on the continue button
    And user clicks on the finish button
    Then user get "Thank you for your order!" message
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |