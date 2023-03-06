package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {
    public final static String BOOKS_URL = BASE_URL+"carti-copii";

    @FindBy(xpath = "/html/body/main[1]/div/section[4]/div/div[2]/section[2]/div/ul/li[1]/div/div[3]/div/a/img")
    public WebElement addBookToFavorites;

    public BooksPage(WebDriver driver) {
        super(driver);
    }
}

