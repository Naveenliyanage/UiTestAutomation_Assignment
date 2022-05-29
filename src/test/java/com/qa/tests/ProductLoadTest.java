package com.qa.tests;

import com.qa.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductLoadTest extends LoginTest {

    @Test
    public void productLoadTest() throws InterruptedException {

       loginTest();
       Thread.sleep(3000);
       clickElement(new By.ByXPath("//a[@id='item_0_title_link']/div"));
       Thread.sleep(3000);
       Assert.assertTrue(isVisible(By.id("back-to-products")),"Product Item not loaded...");

    }
}
