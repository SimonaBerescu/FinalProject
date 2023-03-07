package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath ="//*[@id=\"login\"]/form/div[1]")
    WebElement alertMessage;

    @FindBy(xpath ="//*[@id=\"left-column\"]/div/div/div[1]/ul/li[4]/a/img")
    WebElement adrese;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean alertMessageIsDisplayed (){
        return alertMessage.isDisplayed();
    }

    public void clickAdrese(){
        adrese.click();
    }



}
