package com.example.demo.drivers;

import com.example.demo.utils.InvokeUtil;
import com.example.demo.utils.SeleniumUtil;
import io.swagger.models.auth.In;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author: zw.wen
 */
@Slf4j
public class ChromeDriverTest {
    @SneakyThrows
    @Test
    public void testDockerSelenium() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444"), chromeOptions);
        driver.get("https://www.baidu.com");
        driver.wait(3000);
//        WebElement.class.getMethod("sendKeys", CharSequence[].class).invoke(driver.findElement(By.id("#kw")), "Hello");
//        WebElement.class.getMethod("click").invoke(driver.findElement(By.id("#su")), null);
        driver.quit();
    }

    @Test
    public void testInvokeUtil() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InterruptedException {
        SeleniumUtil seleniumUtil = new SeleniumUtil(1, "https://www.baidu.com");
        seleniumUtil.invoke("click","id","s-top-loginbtn",null);
        Thread.sleep(3000);
        seleniumUtil.invoke("click","id","TANGRAM__PSP_11__footerULoginBtn",null);
        seleniumUtil.invoke("send","id","TANGRAM__PSP_11__userName","a403481704@sina.cn");
        seleniumUtil.invoke("send","id","TANGRAM__PSP_11__password","a403481704");
        seleniumUtil.invoke("click","id","TANGRAM__PSP_11__submit",null);


    }
}
