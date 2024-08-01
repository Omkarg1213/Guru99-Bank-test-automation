Test Cases for Guru99 Bank Application
Test Case Summary
<table>
  <tr>
    <th>Test Case ID</th>
    <th>Description</th>
    <th>Status</th>
  </tr>
  <tr>
    <td>TC_Login_1</td>
    <td>Verify the login section with valid credentials</td>
    <td>Passed</td>
  </tr>
  <tr>
    <td>TC_Login_2</td>
    <td>Verify the login section with invalid UserId</td>
    <td>Passed</td>
  </tr>
  <tr>
    <td>TC_Login_3</td>
    <td>Verify the login section with invalid Password</td>
    <td>Passed</td>
  </tr>
  <tr>
    <td>TC_Login_4</td>
    <td>Verify the login section with invalid UserId and Password</td>
    <td>Passed</td>
  </tr>
</table>
Detailed Test Cases
Test Case ID: TC_Login_1
Description: Verify the login section by entering valid user id and password.
Preconditions:
Valid user id
Valid password
Steps to Execute:
Go to Guru99 Bank Login
Enter valid user id.
Enter valid password.
Click on login.
Validate the output.
Take a screenshot of the output.
Expected Result: Login successful and Guru99 Bank Manager HomePage is displayed.
Actual Result: As expected.
Status: Passed
Test Case ID: TC_Login_2
Description: Verify the login section by entering an invalid user id and a valid password.
Preconditions:
Invalid user id
Valid password
Steps to Execute:
Go to Guru99 Bank Login
Enter invalid user id.
Enter valid password.
Click on login.
Validate the output.
Take a screenshot of the output.
Expected Result: Pop-up "User or Password is not valid" is shown.
Actual Result: As expected.
Status: Passed
Test Case ID: TC_Login_3
Description: Verify the login section by entering a valid user id and an invalid password.
Preconditions:
Valid user id
Invalid password
Steps to Execute:
Go to Guru99 Bank Login
Enter valid user id.
Enter invalid password.
Click on login.
Validate the output.
Take a screenshot of the output.
Expected Result: Pop-up "User or Password is not valid" is shown.
Actual Result: As expected.
Status: Passed
Test Case ID: TC_Login_4
Description: Verify the login section by entering an invalid user id and an invalid password.
Preconditions:
Invalid user id
Invalid password
Steps to Execute:
Go to Guru99 Bank Login
Enter invalid user id.
Enter invalid password.
Click on login.
Validate the output.
Take a screenshot of the output.
Expected Result: Pop-up "User or Password is not valid" is shown.
Actual Result: As expected.
Status: Passed
Summary Report
All test cases have been executed successfully, with each scenario validating the login functionality for the Guru99 Bank application. Screenshots of each outcome have been captured and stored in the designated directory.