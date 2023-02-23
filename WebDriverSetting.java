package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Chrome/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
