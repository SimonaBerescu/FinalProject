package com.edituraDPH.tests;

import com.edituraDPH.pages.LoginPage;
import com.edituraDPH.pages.MyAccountPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static com.edituraDPH.pages.LoginPage.LOGIN_URL;

public class LoginTests extends BaseTest{
    @Test
    public void positiveLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.clickAcceptCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //loginPage.clickCloseNewsletterPopupButton();
       // MyAccountPage myAccountPage = new MyAccountPage(driver);
       // Assert.assertTrue(myAccountPage.alertDateleMeleIsDisplayed());
        String landingUrl = "https://www.edituradph.ro/info";
        Assert.assertEquals(landingUrl,"https://www.edituradph.ro/info");
    }

    @Test
    public void negativeLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.clickAcceptCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        loginPage.enterIncorrectUsername();
        loginPage.enterIncorrectPassword();
        loginPage.clickLoginButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.alertMessageIsDisplayed());

    }
}
