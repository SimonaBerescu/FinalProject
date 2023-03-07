package com.edituraDPH.tests;

import com.edituraDPH.pages.BooksToCartPage;
import com.edituraDPH.pages.FavoritesBooksPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.edituraDPH.pages.BooksToCartPage.BOOKSTOBUY_URL;

public class AddBooksToCartTest extends BaseTest{
    @Test
    public void addToCartTest(){
        driver = new ChromeDriver();
        driver.get(BOOKSTOBUY_URL);
        BooksToCartPage booksToCartPage = new BooksToCartPage(driver);
        booksToCartPage.clickAcceptCookies();
        booksToCartPage.clickIncreaseQuantityButton();
        booksToCartPage.clickAddToCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        booksToCartPage.clickGoToCartButton();
        Assert.assertTrue(booksToCartPage.bookIsDisplayedInCart());
    }
}
