package com.elefant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{
    public final static String LOGIN_URL = BASE_URL+"login";

    @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement acceptCookies;
    @FindBy(xpath = "//*[@id=\"ShopLoginForm_Login\"]")
    public WebElement usernameInput;
    @FindBy(xpath = "//*[@id=\"ShopLoginForm_Password\"]")
    public WebElement passwordInput;
    @FindBy(xpath = "/html/body/div[4]/div/div[9]/div[1]/div/div[1]/div/form/div[4]/div/button")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickAcceptCookies() {
        acceptCookies.click();
    }

    public void enterCorrectUsername(){
        usernameInput.sendKeys("sim2901ce@gmail.com");
    }

    public void enterIncorrectUsername(){
        usernameInput.sendKeys("simona_gorgos@yahoo.com");
    }

    public void enterCorrectPassword(){
        passwordInput.sendKeys("simona  ");
    }

    public void enterIncorrectPassword() {
        passwordInput.sendKeys("password!");
    }

    public void clickLoginButton() {
        loginButton.click();

    }
}
