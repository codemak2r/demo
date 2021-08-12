package com.example.demo.utils;

import cn.hutool.core.io.FileUtil;
import com.example.demo.enums.BrowserType;
import com.example.demo.enums.ElementType;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static com.example.demo.enums.ElementType.*;

/**
 * @author: zw.wen
 */
@Slf4j
@Setter
public class SeleniumUtil{
    private WebDriver webDriver;
    private WebElement webElement;
    private String value;
    private final String FILE_WITH_PATH = "";

    public SeleniumUtil(int browser, String url) {
       try{
           if(BrowserType.FIREBOX.getIndex() == browser) {
               FirefoxOptions firefoxOptions = new FirefoxOptions();
               this.webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), firefoxOptions);
           }else{
               ChromeOptions chromeOptions = new ChromeOptions();
               this.webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), chromeOptions);
           }
       }catch (MalformedURLException e) {

       }
       this.webDriver.get(url);
    }

    public void invoke( String action, String elementType, String element, String value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (elementType == null && element == null) {
            SeleniumUtil.class.getMethod(action).invoke(this);
            return ;
        }

        if (value != null) {
            this.setValue(value);
        }

        this.findElement(elementType,element);
        SeleniumUtil.class.getMethod(action).invoke(this);
    }

    private By locateElement(String elementType, String element){
        try {
            return (By)By.class.getMethod(elementType, String.class).invoke(null, element);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            log.error("调用失败");
        } catch (NoSuchMethodException e) {
            log.error("没有此方法");
        }
        return null;
    }
    public void findElement(String elementType, String element){
        By by = this.locateElement(elementType, element);
        this.webElement = this.webDriver.findElement(by);
    }

    public void click() {
        this.webElement.click();
    }

    public void submit() {
        this.webElement.submit();
    }

    public void send() {
        this.webElement.sendKeys(this.value);
    }

    public void clear() {

    }

    public String getTagName() {
        return null;
    }

    public String getDomProperty(String name) {
        return null;
    }

    
    public String getDomAttribute(String name) {
        return null;
    }

    
    public String getAttribute(String name) {
        return null;
    }

    
    public String getAriaRole() {
        return null;
    }

    
    public String getAccessibleName() {
        return null;
    }

    
    public boolean isSelected() {
        return false;
    }

    
    public boolean isEnabled() {
        return false;
    }

    
    public String getText() {
        return null;
    }


    public void get(String url) {

    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<WebElement> findElements(By by) {
        return null;
    }

    
    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {
        this.webDriver.quit();
    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public void switchTo() {

    }

    public void navigate() {

    }

    public void manage() {

    }


    public boolean isDisplayed() {
        return false;
    }

    
    public Point getLocation() {
        return null;
    }

    
    public Dimension getSize() {
        return null;
    }

    
    public Rectangle getRect() {
        return null;
    }

    
    public String getCssValue(String propertyName) {
        return null;
    }

    
    public void getScreenshotAs(){
        TakesScreenshot scrShot =((TakesScreenshot)this.webDriver);
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File(FILE_WITH_PATH);
        FileUtil.copy(srcFile, destFile, true);
    }
}
