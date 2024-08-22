Feature: Product Listing
  As a User,
  I want to see an ordered list of the available products
  so that I can choose from them.


  Scenario Outline: Product list is displayed
    Given user is using "<browser>" browser
    And user is on the "https://www.saucedemo.com/" page
    When user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on the login button
    Then user can see the product list
    Examples:
      | browser |
      | edge    |
      | chrome  |
      | firefox |

    Scenario Outline: Products can be in an ordered list
      Given user is using "<browser>" browser
      And user is on the "https://www.saucedemo.com/" page
      When user enters "standard_user" username
      And user enters "secret_sauce" password
      And user clicks on the login button
      And user is on the "https://www.saucedemo.com/inventory.html" home page
      And user selects the low to high sorting method
      Then user sees products in "Price (low to high)" sorting
      Examples:
        | browser |
        | edge    |
        | chrome  |
        | firefox |