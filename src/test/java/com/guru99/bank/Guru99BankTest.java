package com.guru99.bank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.guru99.bank.DriverFactory.DriverFactory;
import com.guru99.bank.pages.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Guru99BankTest {
    private WebDriver driver;
    private Properties config;
    private SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
        config = new Properties();
        softAssert = new SoftAssert();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration file");
        }

        String applicationUrl = config.getProperty("AUTLINK");
        if (applicationUrl == null) {
            throw new RuntimeException("URL is not defined in the config.properties file");
        }
        driver.get(applicationUrl);
        driver.manage().window().maximize();
    }

    /**
     * This method will perform following Test Steps:
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter valid UserId
     * 3) Enter valid Password
     * 4) Click Login
     * 5) Verify the Page Title after login
     */
    @Test
    public void loginWithValidUserIdAndValidPassword() {
        String validUsername = config.getProperty("username");
        if (validUsername == null) {
            throw new RuntimeException("username is not defined in the config.properties file");
        }
        String validPassword = config.getProperty("password");
        if (validPassword == null) {
            throw new RuntimeException("password is not defined in the config.properties file");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin(validUsername, validPassword);

        String expectedTitle = config.getProperty("expectedTitle");
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle, "Login test failed - Title mismatch");

        softAssert.assertAll();
    }

    /**
     * This method will perform following Test Steps:
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter invalid UserId
     * 3) Enter valid Password
     * 4) Click Login
     * 5) Verify the PopUp="User or Password is not valid"
     */
    @Test
    public void loginWithInvalidUserIdAndValidPassword() {
        String invalidUsername = config.getProperty("invalidUsername");
        if (invalidUsername == null) {
            throw new RuntimeException("invalidUsername is not defined in the config.properties file");
        }
        String validPassword = config.getProperty("password");
        if (validPassword == null) {
            throw new RuntimeException("password is not defined in the config.properties file");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin(invalidUsername, validPassword);

        String expectedAlertMessage = config.getProperty("expectedPopUpInvalidLogin");
        Alert alert = driver.switchTo().alert();
        String actualAlertMessage = alert.getText();
        softAssert.assertEquals(actualAlertMessage, expectedAlertMessage, "Login test failed - Alert message mismatch");
        alert.accept();

        softAssert.assertAll();
    }

    /**
     * This method will perform following Test Steps:
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter valid UserId
     * 3) Enter invalid Password
     * 4) Click Login
     * 5) Verify the PopUp="User or Password is not valid"
     */
    @Test
    public void loginWithValidUserIdAndInvalidPassword() {
        String validUsername = config.getProperty("username");
        if (validUsername == null) {
            throw new RuntimeException("username is not defined in the config.properties file");
        }
        String invalidPassword = config.getProperty("invalidPassword");
        if (invalidPassword == null) {
            throw new RuntimeException("invalidPassword is not defined in the config.properties file");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin(validUsername, invalidPassword);

        String expectedAlertMessage = config.getProperty("expectedPopUpInvalidLogin");
        Alert alert = driver.switchTo().alert();
        String actualAlertMessage = alert.getText();
        softAssert.assertEquals(actualAlertMessage, expectedAlertMessage, "Login test failed - Alert message mismatch");
        alert.accept();

        softAssert.assertAll();
    }

    /**
     * This method will perform following Test Steps:
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter invalid UserId
     * 3) Enter invalid Password
     * 4) Click Login
     * 5) Verify the PopUp="User or Password is not valid"
     */
    @Test
    public void loginWithInvalidUserIdAndInvalidPassword() {
        String invalidUsername = config.getProperty("invalidUsername");
        if (invalidUsername == null) {
            throw new RuntimeException("invalidUsername is not defined in the config.properties file");
        }
        String invalidPassword = config.getProperty("invalidPassword");
        if (invalidPassword == null) {
            throw new RuntimeException("invalidPassword is not defined in the config.properties file");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin(invalidUsername, invalidPassword);

        String expectedAlertMessage = config.getProperty("expectedPopUpInvalidLogin");
        Alert alert = driver.switchTo().alert();
        String actualAlertMessage = alert.getText();
        softAssert.assertEquals(actualAlertMessage, expectedAlertMessage, "Login test failed - Alert message mismatch");
        alert.accept();

        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
