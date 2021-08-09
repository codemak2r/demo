package com.example.demo.drivers;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

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
        driver.quit();
    }
}
