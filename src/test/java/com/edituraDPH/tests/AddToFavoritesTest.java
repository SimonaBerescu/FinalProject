package com.edituraDPH.tests;

import com.edituraDPH.pages.FavoritesBooksPage;
import com.edituraDPH.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.edituraDPH.pages.FavoritesBooksPage.BOOKS_URL;
import static com.edituraDPH.pages.LoginPage.LOGIN_URL;

public class AddToFavoritesTest extends BaseTest{
    @Test
     public void addToFavorites() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
       WebElement iframe = driver.findElement(By.xpath("//*[@id=\"login\"]/form/h2"));
       WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
       new Actions(driver)
               .scrollFromOrigin(scrollOrigin, 0, 200)
               .perform();
        loginPage.enterCorrectPassword();
        loginPage.enterCorrectUsername();
        loginPage.clickLoginButton();
        FavoritesBooksPage booksPage = new FavoritesBooksPage(driver);
        driver.get(BOOKS_URL);
        booksPage.clickAcceptCookies();
        booksPage.addToFavorites();
        Assert.assertTrue(booksPage.bookIsDisplayedInFavoritesList());
        booksPage.clickDeleteBook();

    }

}
