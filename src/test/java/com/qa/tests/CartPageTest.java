package com.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends LoginTest{
    @Test
    public void cartPageTest() throws InterruptedException {
        loginTest();
        clickElement(By.id("add-to-cart-sauce-labs-backpack"));
        clickElement(new By.ByXPath("//*[@id=\"shopping_cart_container\"]/a"));
        Thread.sleep(1000);
        Assert.assertTrue(isVisible(By.xpath("//*[@id=\"item_4_title_link\"]/div")),"Item not added...");
    }
}
