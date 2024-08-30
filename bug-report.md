
## The project currently has the following known issues:
* Form Validation Bypass on Checkout Page
* Checkout Process Bypass Without Adding Products
* Registration Functionality Not Available


## Example of the bug report
### Form Validation Bypass on Checkout Page
**Description**

-   When attempting to proceed with checkout on the webshop, 
users are required to fill out a form with their first name, last name, and postal code. 
However, the system allows users to proceed to the next step even if invalid information is entered into these fields.

**Environment:**

- Operating System: [Windows11]

- Browser:

  [Microsoft Edge, version: 127.0]

  [Chrome, version: 127.0]

  [Firefox version: 129.0]

**Steps to reproduce:**

1. Open the website.

2. Fill out the login form with valid credentials: Username: “standard_user“ , Password: “secret_sauce“

3. Click the “Login" button.

4. Add any product to the shopping cart.

5. Navigate to the checkout page.

6. In the checkout form, enter invalid or incorrect data in the fields for first name, last name, and postal code.

7. Attempt to proceed to the next step in the checkout process.

**Expected result:**

-   The system should validate the input fields and prevent users from moving forward if any of the entered data is incorrect or invalid.

**Actual result:**

-   Users can bypass the form validation and proceed to the next step even with incorrect or invalid data.

**Impact:**  
This issue could lead to incorrect or incomplete orders being processed, which may result in customer dissatisfaction and operational challenges.

**These issues are listed in the project's task board in the "TO DO" column and are awaiting resolution.**