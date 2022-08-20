package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends KalkulatorHelper {
    By tambah=By.xpath("//button[@value='+']");
    By kurang=By.xpath("//button[@value='-']");
    By kali=By.xpath("//button[@value='*']");
    By bagi=By.xpath("//button[@value='/']");
    By samaDengan=By.xpath("//button[@id='resultButton']");
    static By titik=By.xpath("//button[@value='.']");
    By nol=By.xpath("//button[@value='0']");
    By satu=By.xpath("//button[@value='1']");
    By dua=By.xpath("//button[@value='2']");
    By enam=By.xpath("//button[@value='6']");
    By AC=By.xpath("//button[@id='clearButton']");
    By CE=By.xpath("//button[@id='deleteButton']");
    static By output = By.xpath("//div[@id='output']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickDua(){
        driver.findElement(dua).click();
    }
    public void clickTambah(){
        driver.findElement(tambah).click();
    }
    public void clickEnam(){
        driver.findElement(enam).click();
    }
    public void clickSamaDengan(){
        driver.findElement(samaDengan).click();
    }
    public void clickKurang(){driver.findElement(kurang).click();}
    public void clickbagi(){driver.findElement(bagi).click();}
    public void clickSatu(){driver.findElement(satu).click();}

    public void clickKali(){
        driver.findElement(kali).click();
    }

    public static boolean isDisplayed(){
        return verifyElement(titik);
    }

    public static String getOutput(){
        return getText(output);
    }

}
