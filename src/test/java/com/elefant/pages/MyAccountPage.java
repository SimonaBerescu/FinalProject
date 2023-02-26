package com.elefant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{

    @FindBy(xpath="/html/body/div[2]/div/div[9]/div/div[1]/h2")
    WebElement myAccount;

    @FindBy(xpath ="/html/body/div[3]/div/div[9]/div[1]/div/div[1]/div/div")
    WebElement alertMessage;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    public boolean alertMyAccountIsDisplayed(){
        return myAccount.isDisplayed();
    }

    public boolean alertMessageIsDisplayed (){
        return alertMessage.isDisplayed();
    }



}
