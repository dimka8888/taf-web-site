package by_itAcademy_Ivanchikov_d;

import by_ITAcademe_Ivanchikov_d.OzPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testOz {
    @Test
    public void testOzUserNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage oz = new OzPage();
        WebElement inputButtonMain = driver.findElement(By.xpath(oz.inputButtonMain));
        inputButtonMain.click();
        Thread.sleep(2000);
        WebElement tabLinkEmail = driver.findElement(By.xpath(oz.tabLinkEmail));
        tabLinkEmail.click();
        Thread.sleep(2000);
        WebElement inputTextEmail = driver.findElement(By.xpath(oz.inputTextEmail));
        inputTextEmail.sendKeys("dmitry@mail.ru");
        WebElement inputTextPassword = driver.findElement(By.xpath(oz.inputTextPassword));
        inputTextPassword.sendKeys("111111");
        WebElement inputButtonForm = driver.findElement(By.xpath(oz.inputButtonForm));
        inputButtonForm.click();
        Thread.sleep(2000);
        WebElement textError = driver.findElement(By.xpath(oz.textError));
        String actualError = textError.getText();
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", actualError);
        driver.quit();
    }

    @Test
    public void testOzTextEnter() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage oz = new OzPage();
        WebElement inputButtonMain = driver.findElement(By.xpath(oz.inputButtonMain));
        inputButtonMain.click();
        Thread.sleep(2000);
        WebElement textEnter = driver.findElement(By.xpath(oz.textEnter));
        String actualEnter = textEnter.getText();
        Assertions.assertEquals("Вход", actualEnter);
        driver.quit();
    }


}
