package com.lethanh98.examplejunit.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAuto {
    @Test()
    public void notValid() {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "D:\\Newfolder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/#";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        driver.findElement(new By.ByName("emailid")).sendKeys("test");
        String data = getMsg(driver);
        Assert.assertEquals("Email ID is not valid", data);

        driver.close();
    }

    @Test()
    public void ok() {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "D:\\Newfolder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/#";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        driver.findElement(new By.ByName("emailid")).sendKeys("ds@gmail.com");
        String data = getMsg(driver);
        Assert.assertEquals("", data);
        driver.close();
    }

    String getMsg(WebDriver driver) {
        return driver.findElement(By.id("message9")).getText().trim();
    }
}
