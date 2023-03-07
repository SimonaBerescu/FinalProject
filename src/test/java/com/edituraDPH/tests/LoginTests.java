package com.edituraDPH.tests;

import com.edituraDPH.pages.LoginPage;
import com.edituraDPH.pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
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
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"login\"]/form/h2"));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String landingUrl = "https://www.edituradph.ro/info";
        Assert.assertEquals(landingUrl,"https://www.edituradph.ro/info");
    }

    @Test
    public void negativeLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"login\"]/form/h2"));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        loginPage.enterIncorrectUsername();
        loginPage.enterIncorrectPassword();
        loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.alertMessageIsDisplayed());

    }
}
