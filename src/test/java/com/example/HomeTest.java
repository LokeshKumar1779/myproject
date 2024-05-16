package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class HomeTest {

    WebDriver driver;
    @Test
    public void launchBrowser(){

        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
