package com.edituraDPH.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"addresses\"]/div/div[1]/a")
    WebElement adaugaAdresaNouaButton;

    @FindBy(id = "county")
    WebElement alegeJudetul;

    @FindBy(id = "city")
    WebElement alegeOrasul;

    @FindBy(id = "streetaddress")
    WebElement adaugaAdresa;

    @FindBy(xpath = "//*[@id=\"addresses\"]/div/div[2]/form/div[4]/div/div/button")
    WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"addressid-34319\"]/div[1]")
    WebElement adresa1;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public void adaugaAdresaNoua(){
        adaugaAdresaNouaButton.click();
    }

    public void selectCounty(){
        Select county = new Select(alegeJudetul);
        county.selectByValue("20");
    }
    public void selectCity(){
        Select city = new Select(alegeOrasul);
        city.selectByValue("2949");
    }
    public void addAdaugaAdresa(){
        adaugaAdresa.sendKeys("Strada Horea 80, ap. 1");
    }
    public void clickSaveButton(){
        saveButton.click();
    }
    public boolean address1IsDisplayed(){
        return adresa1.isDisplayed();
    }
}
