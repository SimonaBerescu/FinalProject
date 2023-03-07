package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesBooksPage extends BasePage {
    public final static String BOOKS_URL = BASE_URL+"mami-e-gata-aventuri-haioase-in-bucatarie.html";

    @FindBy(xpath = "/html/body/section/div[1]/header/div[2]/input")
    WebElement acceptCookies;

    @FindBy(xpath = "//*[@id=\"add-to-favorite\"]")
    public WebElement addBookToFavorites;

    @FindBy(xpath = "//*[@id=\"wishlists\"]/div/div/div/div/a")
    WebElement book;

    @FindBy(xpath = "//*[@id=\"wishlists\"]/div/div/div/div/div/div[2]/div[1]/a")
    WebElement deleteBook;

    public void clickAcceptCookies(){
        acceptCookies.click();
    }
    public FavoritesBooksPage(WebDriver driver) {
        super(driver);
    }

    public void addToFavorites(){
        addBookToFavorites.click();
    }

    public boolean bookIsDisplayedInFavoritesList(){
        return book.isDisplayed();
    }

    public void clickDeleteBook(){
        deleteBook.click();
    }
}

