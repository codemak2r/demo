package com.example.demo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author: zw.wen
 */
public class SeleniumUtil {
    private WebDriver webDriver;

    public SeleniumUtil(ChromeDriver chromeDriver) {
        webDriver =chromeDriver;
    }

    public SeleniumUtil(FirefoxDriver firefoxDriverDriver) {
        webDriver = firefoxDriverDriver;
    }

    public void click(By by) {
        this.webDriver.findElement(by).click();
    }

    public void sendKey(By by, String val) {
        this.webDriver.findElement(by).sendKeys(val);
    }

}
