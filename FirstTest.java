package ru.deliveryClub;

import org.junit.*;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.time.Duration;


public class FirstTest extends WebDriverSetting {


    @Test
    // Title соответсвует title сайта
    public void Test1() {
        driver.get("https://www.delivery-club.ru");
        String title = driver.getTitle();
        Assert.assertEquals("Быстрая доставка еды Delivery Club", title);
    }

    @Test
    // Title не соответсвует title сайта
    public void Test2() {
        driver.get("https://www.delivery-club.ru");
        String title = driver.getTitle();
        Assert.assertNotEquals("Delivery Club", title);
    }

    @Test
    // Проверка поисковой строки на возможность ввода
    public void Test3() {
        driver.get("https://www.delivery-club.ru");
        driver.findElement(By.xpath("//*[@id=\"id_1\"]")).sendKeys("cheese" + Keys.ENTER);
    }

    @Test
    // Проверка кликкабельности ресторанов
    public void Test4()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Неявное ожидание Selenium
        driver.get("https://www.delivery-club.ru");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div[6]/div/div[2]/div[3]/div/ul/li[1]/div/div/a/div[1]/div[1]")).click();

    }
    @Test
    // Проверка работоспособности авторизации
    public void Test5()  {
        driver.get("https://www.delivery-club.ru");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"passp-field-phone\"]")).sendKeys("9999999999" + Keys.ENTER);
    }
}

