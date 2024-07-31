# Test Cases for Guru99 Bank Application

## **Test Case Summary**

| **Test Case ID** | **Description**                                           | **Status** |
|------------------|-----------------------------------------------------------|------------|
| TC_Login_1       | Verify the login section with valid credentials           | Passed     |
| TC_Login_2       | Verify the login section with invalid UserId              | Passed     |
| TC_Login_3       | Verify the login section with invalid Password            | Passed     |
| TC_Login_4       | Verify the login section with invalid UserId and Password | Passed     |

## **Detailed Test Cases**

### **Test Case ID: TC_Login_1**
- **Description**: Verify the login section by entering valid user id and password.
- **Preconditions**:
  - Valid user id
  - Valid password
- **Steps to Execute**:
  1. Go to [Guru99 Bank Login](https://www.demo.guru99.com/V4/)
  2. Enter valid user id.
  3. Enter valid password.
  4. Click on login.
  5. Validate the output.
  6. Take a screenshot of the output.
- **Expected Result**: Login successful and Guru99 Bank Manager HomePage is displayed.
- **Actual Result**: As expected.
- **Status**: Passed

### **Test Case ID: TC_Login_2**
- **Description**: Verify the login section by entering an invalid user id and a valid password.
- **Preconditions**:
  - Invalid user id
  - Valid password
- **Steps to Execute**:
  1. Go to [Guru99 Bank Login](https://www.demo.guru99.com/V4/)
  2. Enter invalid user id.
  3. Enter valid password.
  4. Click on login.
  5. Validate the output.
  6. Take a screenshot of the output.
- **Expected Result**: Pop-up "User or Password is not valid" is shown.
- **Actual Result**: As expected.
- **Status**: Passed

### **Test Case ID: TC_Login_3**
- **Description**: Verify the login section by entering a valid user id and an invalid password.
- **Preconditions**:
  - Valid user id
  - Invalid password
- **Steps to Execute**:
  1. Go to [Guru99 Bank Login](https://www.demo.guru99.com/V4/)
  2. Enter valid user id.
  3. Enter invalid password.
  4. Click on login.
  5. Validate the output.
  6. Take a screenshot of the output.
- **Expected Result**: Pop-up "User or Password is not valid" is shown.
- **Actual Result**: As expected.
- **Status**: Passed

### **Test Case ID: TC_Login_4**
- **Description**: Verify the login section by entering an invalid user id and an invalid password.
- **Preconditions**:
  - Invalid user id
  - Invalid password
- **Steps to Execute**:
  1. Go to [Guru99 Bank Login](https://www.demo.guru99.com/V4/)
  2. Enter invalid user id.
  3. Enter invalid password.
  4. Click on login.
  5. Validate the output.
  6. Take a screenshot of the output.
- **Expected Result**: Pop-up "User or Password is not valid" is shown.
- **Actual Result**: As expected.
- **Status**: Passed

## **Summary Report**

All test cases have been executed successfully, with each scenario validating the login functionality for the Guru99 Bank application. Screenshots of each outcome have been captured and stored in the designated directory.

---

## **Selenium Setup**

1. **Download and Install Java**: Ensure Java is installed and configured on your machine.
2. **Download and Install Eclipse/IDE**: Use an IDE like Eclipse for writing and executing test scripts.
3. **Add Selenium WebDriver Libraries**: Download the Selenium WebDriver Java client from [Selenium's website](https://www.selenium.dev/downloads/) and add the JAR files to your project.
4. **Set up WebDriver**: Download the appropriate WebDriver executable (e.g., ChromeDriver for Chrome) and configure it in your test scripts.

## **Cucumber Framework**

1. **Add Cucumber Dependencies**: Include Cucumber dependencies in your project (e.g., `cucumber-java`, `cucumber-junit`).
2. **Create Feature Files**: Write your test scenarios in Gherkin syntax and save them in `.feature` files.
3. **Write Step Definitions**: Implement the steps defined in the feature files using Java.
4. **Configure Test Runner**: Create a test runner class to execute your Cucumber tests.

## **Page Object Model Structure**

1. **Create Page Classes**: Define a class for each page in your application. Each class should contain methods to interact with the elements on that page.
2. **Define Locators**: Use `@FindBy` annotations to locate elements on the page.
3. **Implement Actions**: Write methods to perform actions and verify elements on the page.
4. **Use Page Objects in Tests**: Instantiate the page objects in your test scripts and use them to interact with the application.

---

*Documentation written and executed by Omkar G.*