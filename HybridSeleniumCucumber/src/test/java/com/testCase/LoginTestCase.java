package com.testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class LoginTestCase extends Library {
	@BeforeTest
    public void startUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/%22");

    }
    @Test
    public void login() {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");

    }
    @AfterClass
    public void close() throws IOException, InterruptedException {
        SeleniumUtilities sUti = new SeleniumUtilities(driver);
        //sUti.to_take_screenshot("C:\\Users\\Acer\\eclipse-workspace\\LTI\\HybridSeleniumCucumber\\src\\test\\resources\\ScreenShots\\orangeHRMLogin.png");
        sUti.to_take_screenshot("src\\test\\resources\\ScreenShots\\Login.png");

        quit();

    }

 }