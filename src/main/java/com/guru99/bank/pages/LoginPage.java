package com.guru99.bank.pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameInput = By.name("uid");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void toLogin(String username, String password) {
    	driver.findElement(usernameInput).clear();;
        driver.findElement(usernameInput).sendKeys(username);
        
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
        
        driver.findElement(loginButton).click();
    }
    
    public void takeScreenshot(String fileName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
