package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BsTest {
    WebDriver driver;
    WebDriverWait w;

    @Before
    public void openBrowser(){
        System.out.println("Base Test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");
        driver.manage().window().maximize();
        w=new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
