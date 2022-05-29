package com.qa.tests;

import com.qa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        openPage("https://www.saucedemo.com/");
        typeText(By.id("user-name"),"standard_user");
        typeText(By.id("password"),"secret_sauce");
        clickElement(By.id("login-button"));
        Assert.assertTrue(isVisible(By.id("inventory_container")),"Login Page not loaded...");
    }
}
