Feature: API GET request to the Webshop

  Scenario: Send a GET request to the home page
    Given user send a GET request to "https://www.saucedemo.com/"
    Then the response status code should be 200
