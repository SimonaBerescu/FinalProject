package com.elefant.tests;

import com.elefant.pages.LoginPage;
import com.elefant.pages.MyAccountPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.elefant.pages.LoginPage.LOGIN_URL;

public class LoginTests extends BaseTest{
    @Test
    public void positiveLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage.clickAcceptCookies();
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.clickLoginButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.alertMyAccountIsDisplayed());

    }

    @Test
    public void negativeLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage.clickAcceptCookies();
        loginPage.enterIncorrectUsername();
        loginPage.enterIncorrectPassword();
        loginPage.clickLoginButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.alertMessageIsDisplayed());

    }
}
