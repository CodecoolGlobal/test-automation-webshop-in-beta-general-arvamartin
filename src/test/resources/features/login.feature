Feature: As a User, I want to log in so that
  I have access to features that require identification.


  Scenario Outline: Successful login with valid credentials
    Given user is on the "https://www.saucedemo.com/" page using "<browser>"
    Examples:
      | browser |
      | edge    |
      | chrome  |

