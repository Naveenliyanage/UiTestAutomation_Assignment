package com.qa.tests;

import com.qa.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvalidLoginTest extends BaseTest {
@Test
    public void invalidLoginTest() throws InterruptedException {
        openPage("https://www.saucedemo.com/");
        typeText(By.id("user-name"),"standard");
        typeText(By.id("password"),"secret");
        clickElement(By.id("login-button"));
        Thread.sleep(3000);
        String actualUrl="https://www.saucedemo.com/inventory.html";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"Failed to load inventory page...");

    }

}
