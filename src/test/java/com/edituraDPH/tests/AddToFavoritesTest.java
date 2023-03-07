package com.edituraDPH.tests;

import com.edituraDPH.pages.FavoritesBooksPage;
import com.edituraDPH.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.clickLoginButton();
        FavoritesBooksPage booksPage = new FavoritesBooksPage(driver);
        driver.get(BOOKS_URL);
        booksPage.clickAcceptCookies();
        booksPage.addToFavorites();
        Assert.assertTrue(booksPage.bookIsDisplayedInFavoritesList());
        booksPage.clickDeleteBook();

    }

}
