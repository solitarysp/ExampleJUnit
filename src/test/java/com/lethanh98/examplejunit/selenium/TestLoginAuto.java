package com.lethanh98.examplejunit.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginAuto {
    public static final String WORKING_DIR = System.getProperty("user.dir");

    @Test()
    public void ok() {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", WORKING_DIR + "\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/login.html";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        setVauleVyId(driver, "email", "test");
        setVauleVyId(driver, "passwd", "matKhau");
        driver.findElement(new By.ById("SubmitLogin")).submit();
        String data = getMsg(driver);
        Assert.assertEquals("Successfully Logged in...", data);
        driver.close();
    }

    private void setVauleVyId(WebDriver driver, String name, String vault) {
        driver.findElement(new By.ById(name)).sendKeys(vault);
    }

    String getMsg(WebDriver driver) {
        return driver.findElement(By.className("error-copy")).getText().trim();
    }
}
