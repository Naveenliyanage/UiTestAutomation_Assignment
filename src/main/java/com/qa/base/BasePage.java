package com.qa.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    public void iniWebDriver(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void getCurrentUrl(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public  void  quitWebDriver(){
        if(null!= driver){
            driver.close();
            driver.quit();
        }
    }

    public void openPage(String url){
        driver.get(url);
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }


    public void typeText(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isVisible(By location){
        return driver.findElement(location).isDisplayed();
    }


}
