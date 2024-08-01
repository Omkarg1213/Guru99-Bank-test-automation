<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test Cases for Guru99 Bank Application</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <h1>Test Cases for Guru99 Bank Application</h1>

    <h2>Test Case Summary</h2>
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

    <h2>Detailed Test Cases</h2>

    <h3>Test Case ID: TC_Login_1</h3>
    <p><strong>Description:</strong> Verify the login section by entering valid user id and password.</p>
    <p><strong>Preconditions:</strong></p>
    <ul>
        <li>Valid user id</li>
        <li>Valid password</li>
    </ul>
    <p><strong>Steps to Execute:</strong></p>
    <ol>
        <li>Go to <a href="https://www.demo.guru99.com/V4/">Guru99 Bank Login</a></li>
        <li>Enter valid user id.</li>
        <li>Enter valid password.</li>
        <li>Click on login.</li>
        <li>Validate the output.</li>
        <li>Take a screenshot of the output.</li>
    </ol>
    <p><strong>Expected Result:</strong> Login successful and Guru99 Bank Manager HomePage is displayed.</p>
    <p><strong>Actual Result:</strong> As expected.</p>
    <p><strong>Status:</strong> Passed</p>

    <h3>Test Case ID: TC_Login_2</h3>
    <p><strong>Description:</strong> Verify the login section by entering an invalid user id and a valid password.</p>
    <p><strong>Preconditions:</strong></p>
    <ul>
        <li>Invalid user id</li>
        <li>Valid password</li>
    </ul>
    <p><strong>Steps to Execute:</strong></p>
    <ol>
        <li>Go to <a href="https://www.demo.guru99.com/V4/">Guru99 Bank Login</a></li>
        <li>Enter invalid user id.</li>
        <li>Enter valid password.</li>
        <li>Click on login.</li>
        <li>Validate the output.</li>
        <li>Take a screenshot of the output.</li>
    </ol>
    <p><strong>Expected Result:</strong> Pop-up "User or Password is not valid" is shown.</p>
    <p><strong>Actual Result:</strong> As expected.</p>
    <p><strong>Status:</strong> Passed</p>

    <h3>Test Case ID: TC_Login_3</h3>
    <p><strong>Description:</strong> Verify the login section by entering a valid user id and an invalid password.</p>
    <p><strong>Preconditions:</strong></p>
    <ul>
        <li>Valid user id</li>
        <li>Invalid password</li>
    </ul>
    <p><strong>Steps to Execute:</strong></p>
    <ol>
        <li>Go to <a href="https://www.demo.guru99.com/V4/">Guru99 Bank Login</a></li>
        <li>Enter valid user id.</li>
        <li>Enter invalid password.</li>
        <li>Click on login.</li>
        <li>Validate the output.</li>
        <li>Take a screenshot of the output.</li>
    </ol>
    <p><strong>Expected Result:</strong> Pop-up "User or Password is not valid" is shown.</p>
    <p><strong>Actual Result:</strong> As expected.</p>
    <p><strong>Status:</strong> Passed</p>

    <h3>Test Case ID: TC_Login_4</h3>
    <p><strong>Description:</strong> Verify the login section by entering an invalid user id and an invalid password.</p>
    <p><strong>Preconditions:</strong></p>
    <ul>
        <li>Invalid user id</li>
        <li>Invalid password</li>
    </ul>
    <p><strong>Steps to Execute:</strong></p>
    <ol>
        <li>Go to <a href="https://www.demo.guru99.com/V4/">Guru99 Bank Login</a></li>
        <li>Enter invalid user id.</li>
        <li>Enter invalid password.</li>
        <li>Click on login.</li>
        <li>Validate the output.</li>
        <li>Take a screenshot of the output.</li>
    </ol>
    <p><strong>Expected Result:</strong> Pop-up "User or Password is not valid" is shown.</p>
    <p><strong>Actual Result:</strong> As expected.</p>
    <p><strong>Status:</strong> Passed</p>

    <h2>Summary Report</h2>
    <p>All test cases have been executed successfully, with each scenario validating the login functionality for the Guru99 Bank application. Screenshots of each outcome have been captured and stored in the designated directory.</p>

</body>
</html>
