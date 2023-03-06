package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath ="//*[@id=\"login\"]/form/div[1]")
    WebElement alertMessage;

    @FindBy(xpath = "//*[@id=\"form-newsletter-popup\"]/div[2]/input")
    WebElement addEmail;

    @FindBy(xpath = "//*[@id=\"form-newsletter-popup\"]/div[1]/input")
    WebElement addName;

    @FindBy(xpath = "//*[@id=\"form-newsletter-popup\"]/div[3]/label[1]/span")
    WebElement checkboxNewsletter;

    @FindBy(xpath ="//*[@id=\"form-newsletter-popup\"]/div[3]/label[2]/span")
    WebElement checkboxTerms;

    @FindBy(xpath = "//*[@id=\"form-newsletter-popup\"]/button")
    WebElement abonare;

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

    public void setAddEmail(){
        addEmail.sendKeys("simona_gorgos@yahoo.com");
    }
    public void setAddName(){
        addName.sendKeys("Simona");
    }
    public void clickCheckboxNewsletter(){
        checkboxNewsletter.click();
    }
    public void clickCheckboxTerms(){
        checkboxTerms.click();
    }
    public void abonareNewsletter(){
        abonare.click();
    }
}
