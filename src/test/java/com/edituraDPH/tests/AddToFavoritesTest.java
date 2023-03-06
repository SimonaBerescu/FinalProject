package com.edituraDPH.tests;

import com.edituraDPH.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.edituraDPH.pages.LoginPage.LOGIN_URL;

public class AddToFavoritesTest extends BaseTest{
    @Test
     public void positiveLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //loginPage.clickAcceptCookies();
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.clickLoginButton();
    }

}
