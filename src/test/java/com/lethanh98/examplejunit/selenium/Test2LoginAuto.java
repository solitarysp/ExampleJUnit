package com.lethanh98.examplejunit.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2LoginAuto {
    public static final String WORKING_DIR = System.getProperty("user.dir");

    @Test()
    public void ok() throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", WORKING_DIR + "\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "https://afe9033d4a27.ngrok.io/";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        setVauleVyId(driver, "idadd", "ad@1");
        setVauleVyId(driver, "passadd", "ad1");
        driver.findElement(new By.ById("btnauthenid")).click();
        Thread.sleep(5000);
        String data = getMsg(driver);
        Assert.assertEquals("This is your QR Code:", data);
        driver.close();
    }

    private void setVauleVyId(WebDriver driver, String name, String vault) {
        driver.findElement(new By.ById(name)).sendKeys(vault);
    }

    String getMsg(WebDriver driver) {
        return driver.findElement(new By.ById("newsview")).getText().trim();
    }
}
