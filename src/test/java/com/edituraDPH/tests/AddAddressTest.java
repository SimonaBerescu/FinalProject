package com.edituraDPH.tests;

import com.edituraDPH.pages.AddressPage;
import com.edituraDPH.pages.LoginPage;
import com.edituraDPH.pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.edituraDPH.pages.LoginPage.LOGIN_URL;

public class AddAddressTest extends BaseTest{
    @Test
    public void positiveLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // loginPage.loginButton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login > form > div.form-actions > div > button")));
        loginPage.clickLoginButton();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //driver.switchTo().frame("form-newsletter-popup");
       // myAccountPage.setAddEmail();
       // myAccountPage.setAddName();
       // myAccountPage.clickCheckboxNewsletter();
      //  myAccountPage.clickCheckboxTerms();
       // myAccountPage.abonareNewsletter();
       // myAccountPage.clickCloseNewsletterPopup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        myAccountPage.clickAdrese();
        AddressPage addressPage = new AddressPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        addressPage.adaugaAdresaNoua();
        addressPage.selectCounty();
        addressPage.selectCity();
        addressPage.addAdaugaAdresa();
        addressPage.clickSaveButton();
        Assert.assertTrue(addressPage.address1IsDisplayed());





    }
}
