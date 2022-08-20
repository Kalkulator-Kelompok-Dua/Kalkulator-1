package org.example;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest extends BsTest {
    @Test
    public void testKalkulator(){
    HomePage homepage=new HomePage(driver);
        Assert.assertTrue(HomePage.isDisplayed());

        homepage.clickEnam();
        homepage.clickTambah();
        homepage.clickSatu();
        homepage.clickKali();
        homepage.clickEnam();
        homepage.clickKurang();
        homepage.clickDua();
        homepage.clickbagi();
        homepage.clickDua();
        homepage.clickSamaDengan();
        Assert.assertEquals("20", HomePage.getOutput());


    }
}
