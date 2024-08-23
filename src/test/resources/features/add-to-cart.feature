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
    Then user sees 2 product on the shopping cart icon
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |

  Scenario Outline: Added products can be removed from the cart
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    And user clicks on add to cart button for a product
    And user clicks on add to cart button for another product
    And user clicks on the shopping cart icon
    And user click on the remove button for the first added product
    Then user sees 1 product on the shopping cart icon
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |

    Scenario Outline: The user can add products to the cart on the product description page
      Given user is using "<browser>" browser
      And user is on the "https://www.saucedemo.com/" page
      And user enters "standard_user" username
      And user enters "secret_sauce" password
      And user clicks on the login button
      And user clicks on the first product
      When user add product to the cart
      And navigate back to the home page
      Then user sees 1 product on the shopping cart icon
      Examples:
        | browser |
        | edge    |
        | chrome  |
        | firefox |