# Webshop in Beta (Selenium Grid Project)
## Overview
This project leverages Selenium Grid to perform automated UI testing on a webshop application (https://www.saucedemo.com/), using various browsers. 
The testing framework is set up using Selenium, Cucumber for behavior-driven development (BDD), and Maven for project management.

## Team Members
- [Ádám Mészáros](https://github.com/adesz0112)
- [Martin Árva](https://github.com/arvamartin)

## Project Structure

- [Team Members](#team-members)
- [Setup Instructions](#setup-instructions)
- [Bug report](#bug-report)
- [Test details](#test-details)

* **Page Object Classes:** Use the provided classes in the pages package to interact with the application.
* **Step Definitions:** Implement BDD scenarios in the StepDefinitions package.
* **Test Features:** Define feature files using Gherkin syntax to outline testing scenarios.

## Technologies
**The project utilizes the following technologies and tools:**

* Java: The programming language used for writing test scripts.
* Apache Maven: A build automation tool used for project management and dependency management.
* JUnit: A testing framework for Java used to write and run tests.
* Selenium WebDriver for controlling web browsers:
   - Microsoft Edge(127.0)
   - Firefox (129.0)
   - Chrome(127.0)
* Cucumber
* Page Object Model (POM) design pattern

## Setup Instructions
### Prerequisites
* Java JDK 21
* Maven
* Docker (for running Selenium Grid)

### Running Selenium Grid with Docker
**Run the following command to start Selenium Grid:**
```bash
docker compose -f docker-compose-v3.yml up
```
**To stop Selenium Grid, use Ctrl+C and then:**
```bash
docker compose -f docker-compose-v3.yml down
```

## Bug report
* The project currently has the following known issues:
  - **Form Validation Bypass on Checkout Page**
    - Description: When attempting to proceed with checkout on the webshop, users are required to fill out a form with their first name, last name, and postal code. However, the system allows users to proceed to the next step even if invalid information is entered into these fields.
  - **Registration Functionality Not Available**
    - Description: Users are unable to register an account on the webshop, as the registration option is not available or visible on the website. This prevents new users from creating accounts and accessing features that require registration.
* These issues are listed in the project's task board in the "TO DO" column and are awaiting resolution.

## Test Details
For detailed information on each test scenario, refer to the feature files under `src/test/resources/features`.