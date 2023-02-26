package com.elefant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    final static String BASE_URL = "https://www.elefant.ro/";

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
