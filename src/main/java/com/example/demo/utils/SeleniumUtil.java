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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;

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

    public void invoke( String action, String elementType, String element,  String value) throws Exception {
        this.setValue(value);
        // this.findElement(elementType,element);
        By by = this.locateElement(elementType, element);
        // https://blog.testproject.io/2019/12/10/smart-selenium-waits-fluent-wait-avoid-flakiness/
        if (by != null) {
            Wait wait = new FluentWait(this.webDriver)
                    .withTimeout(Duration.ofMillis(1000))
                    .pollingEvery(Duration.ofMillis(350))
                    .ignoring(NoSuchElementException.class);
            this.webElement = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
                @Override
                public WebElement apply(WebDriver webDriver) {
                    return webDriver.findElement(by);
                }
            });
        } else {
            this.webElement = null;
        }
        SeleniumUtil.class.getMethod(action).invoke(this);
    }

    private By locateElement(String elementType, String element){
        if(elementType == null || element == null) {
            return null;
        }

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
        if(elementType == null || element == null) {
            this.webElement = null ;
            return;
        }

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
        this.webElement.sendKeys((CharSequence) this.value);
    }

    public void pause(){
        try {
            Thread.sleep(Long.valueOf(this.value));
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }


    public void close() {

    }

    public void confirm(){

    }

    public void doubleClick(){


    }

    public void waitForElement(){

    }


    public void clear() {

    }

    public boolean isSelected() {
        return this.webElement.isSelected();
    }

    
    public boolean isEnabled() {
        return this.webElement.isEnabled();
    }

    
    public String getText() {
        return this.webElement.getText();
    }

    public void quit() {
        this.webDriver.quit();
    }


    public String getCurrentUrl() {
        return this.webDriver.getCurrentUrl();
    }

    public String getTitle() {
        return this.webDriver.getTitle();
    }

    public String getPageSource() {
        return this.webDriver.getPageSource();
    }


    public Set<String> getWindowHandles() {
        return this.webDriver.getWindowHandles();
    }

    public String getWindowHandle() {
        return this.webDriver.getWindowHandle();
    }

    public void switchTo() {
        this.webDriver.switchTo();
    }

    public void navigate() {
        this.webDriver.navigate();
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

    
    public void getScreenshotAs(){
        TakesScreenshot scrShot =((TakesScreenshot)this.webDriver);
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File(FILE_WITH_PATH);
        FileUtil.copy(srcFile, destFile, true);
    }
}
