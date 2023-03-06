package com.edituraDPH.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    protected void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //driver.manage().window().maximize();

    }

    @AfterMethod
    protected void tearDown() {
        //driver.manage().deleteAllCookies();
       driver.close();
    }
}
