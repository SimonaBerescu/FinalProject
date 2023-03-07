package com.edituraDPH.tests;

import com.edituraDPH.pages.AddressPage;
import com.edituraDPH.pages.LoginPage;
import com.edituraDPH.pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.edituraDPH.pages.LoginPage.LOGIN_URL;

public class AddAddressTest extends BaseTest{
    @Test
    public void addAddress() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"login\"]/form/h2"));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage.enterCorrectPassword();
        loginPage.enterCorrectUsername();
        loginPage.clickLoginButton();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickAdrese();

        AddressPage addressPage = new AddressPage(driver);
        addressPage.clickAcceptCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        addressPage.adaugaAdresaNoua();
        addressPage.selectCounty();
        addressPage.selectCity();
        addressPage.addAdaugaAdresa();
        addressPage.clickSaveButton();
        Assert.assertTrue(addressPage.adresa1IsDisplayed());
        Assert.assertTrue(addressPage.addressTextIsDisplayed());





    }
}
