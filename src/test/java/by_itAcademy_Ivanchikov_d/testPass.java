package by_itAcademy_Ivanchikov_d;

import by_ITAcademe_Ivanchikov_d.PassPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPass {
    @Test
    public void testPass() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pass.rw.by/ru/");

        PassPage passPage = new PassPage(driver);
        Thread.sleep(2000);
        {
            WebElement inputButtonMain = driver.findElement(By.xpath(passPage.inputButtonMain));
            inputButtonMain.click();
            Thread.sleep(2000);
        }
        {
            WebElement tabLinkEmailElement = driver.findElement(By.xpath(passPage.tabLinkEmail));
            tabLinkEmailElement.click();
            Thread.sleep(2000);
        }
        {
        WebElement inputTextEmail = driver.findElement(By.xpath(passPage.inputTextEmail));
        inputTextEmail.sendKeys("dmitry@mailru");}
        {

        WebElement inputButtonForm = driver.findElement(By.xpath(passPage.inputButtonForm));
        inputButtonForm.click();
        Thread.sleep(2000);}
        {
        WebElement textError = driver.findElement(By.xpath(passPage.textError));
        String actualError = textError.getText();
        Assertions.assertEquals("Заполните поле", actualError);}

        driver.quit();
    }

}