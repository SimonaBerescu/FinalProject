package com.edituraDPH.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  extends BasePage{
    public final static String LOGIN_URL = BASE_URL+"?page=checkout";

    @FindBy(xpath = "/html/body/section/div[1]/header/div[2]/input")
    WebElement acceptCookies;
    @FindBy(xpath = "//*[@id=\"login\"]/form/div[1]/div/input")
    public WebElement usernameInput;
    @FindBy(xpath = "//*[@id=\"login\"]/form/div[2]/div/input")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"login\"]/form/div[4]/div/button")
    public WebElement loginButton;

    public void clickAcceptCookies(){
        acceptCookies.click();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterCorrectUsername(){
        usernameInput.sendKeys("simona_gorgos@yahoo.com");
    }

    public void enterIncorrectUsername(){
        usernameInput.sendKeys("simona_berescu@yahoo.com");
    }

    public void enterCorrectPassword(){
        passwordInput.sendKeys("Sim2901!");
    }

    public void enterIncorrectPassword() {
        passwordInput.sendKeys("password!");
    }

    public void clickLoginButton() {
       // WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]/form/div[4]/div/button")));
        loginButton.click();

    }
    //JavascriptExecutor js = (JavascriptExecutor) driver;
    //js.executeScript("arguments[0].scrollIntoView();", button);
}
