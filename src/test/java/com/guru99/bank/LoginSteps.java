package com.guru99.bank;

import com.guru99.bank.DriverFactory.DriverFactory;
import com.guru99.bank.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginSteps {
    private WebDriver driver;
    private Properties config;
    private SoftAssert softAssert;

    @Before
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
    }

    @Given("the user is on the Guru99 Bank login page")
    public void theUserIsOnTheGuruBankLoginPage() {
        String applicationUrl = config.getProperty("AUTLINK");
        if (applicationUrl == null) {
            throw new RuntimeException("URL is not defined in the config.properties file");
        }
        driver.get(applicationUrl);
        driver.manage().window().maximize();
    }

    @When("the user enters valid UserId and valid Password")
    public void theUserEntersValidUserIdAndValidPassword() {
        enterCredentials(config.getProperty("username"), config.getProperty("password"));
    }

    @When("the user enters invalid UserId and valid Password")
    public void theUserEntersInvalidUserIdAndValidPassword() {
        enterCredentials(config.getProperty("invalidUsername"), config.getProperty("password"));
    }

    @When("the user enters valid UserId and invalid Password")
    public void theUserEntersValidUserIdAndInvalidPassword() {
        enterCredentials(config.getProperty("username"), config.getProperty("invalidPassword"));
    }

    @When("the user enters invalid UserId and invalid Password")
    public void theUserEntersInvalidUserIdAndInvalidPassword() {
        enterCredentials(config.getProperty("invalidUsername"), config.getProperty("invalidPassword"));
    }

    private void enterCredentials(String username, String password) {
        if (username == null || password == null) {
            throw new RuntimeException("username or password is not defined in the config.properties file");
        }
        LoginPage loginPage = new LoginPage(driver);
        loginPage.toLogin(username, password);
    }

    @Then("the user should be logged in successfully and see the title")
    public void theUserShouldBeLoggedInSuccessfullyAndSeeTheTitle() {
        String expectedTitle = config.getProperty("expectedTitle");
        if (expectedTitle == null) {
            throw new RuntimeException("expectedTitle is not defined in the config.properties file");
        }
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle, "Login test failed - Title mismatch");
        softAssert.assertAll();
    }

    @Then("an alert with message should be displayed")
    public void anAlertWithMessageShouldBeDisplayed() {
        String expectedAlertMessage = config.getProperty("expectedPopUpInvalidLogin");
        if (expectedAlertMessage == null) {
            throw new RuntimeException("expectedAlertMessage is not defined in the config.properties file");
        }
        Alert alert = driver.switchTo().alert();
        String actualAlertMessage = alert.getText();
        softAssert.assertEquals(actualAlertMessage, expectedAlertMessage, "Login test failed - Alert message mismatch");
        alert.accept();
        softAssert.assertAll();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
