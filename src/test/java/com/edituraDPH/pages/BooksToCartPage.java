package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksToCartPage extends BasePage{
    public final static String BOOKSTOBUY_URL = BASE_URL+"cum-sa-faci-doar-ce-conteaza-cu-adevarat.html";

    @FindBy(xpath = "/html/body/section/div[1]/header/div[2]/input")
    WebElement acceptCookies;

    @FindBy(xpath = "//*[@id=\"middle-column\"]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div/a[1]/i")
    WebElement increaseQuantityButton;

    @FindBy(xpath = "//*[@id=\"product_addToCart\"]")
    WebElement addToCartButton;

    @FindBy(id = "go-to-cart")
    WebElement goToCartButton;

    @FindBy(xpath = "//*[@id=\"ProductChangeInput\"]/div[1]/section/table/tbody/tr[2]/td[1]/a/span[1]/img")
    WebElement bookInCart;

    public void clickAcceptCookies(){
        acceptCookies.click();
    }

    public BooksToCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickIncreaseQuantityButton(){
        increaseQuantityButton.click();
    }

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public void clickGoToCartButton(){
        goToCartButton.click();
    }

    public boolean bookIsDisplayedInCart(){
        return bookInCart.isDisplayed();
    }

}
