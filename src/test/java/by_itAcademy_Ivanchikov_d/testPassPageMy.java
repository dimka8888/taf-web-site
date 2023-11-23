package by_itAcademy_Ivanchikov_d;

import by_ITAcademe_Ivanchikov_d.PassPageMy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testPassPageMy{
@Test
public void testPassPageMyAutorisationForm()throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPageMy passRWbyPage=new PassPageMy(driver);
        passRWbyPage.clickButtonPersonalAccount();
        Thread.sleep(1000);
        Assertions.assertEquals("Авторизация",passRWbyPage.getTextHeaderTextAutorisation());
        driver.close();
        }
@Test
public void testPassPageMyEmptyValues()throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPageMy passRWbyPage=new PassPageMy(driver);
        passRWbyPage.clickButtonPersonalAccount();
        Thread.sleep(1000);
        passRWbyPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле",passRWbyPage.getTextErrorMassageLoginOrEmail());
        Assertions.assertEquals("Заполните поле",passRWbyPage.getTextErrorMassagePassword());
        driver.close();
        }
@Test
public void testPassPageMyEmptyEmail()throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPageMy passPageMy=new PassPageMy(driver);
        passPageMy.clickButtonPersonalAccount();
        passPageMy.sendKeysInputPassword("password");
        Thread.sleep(1000);
        passPageMy.clickButtonEnter();
        Assertions.assertEquals("Заполните поле",passPageMy.getTextErrorMassageLoginOrEmail());
        driver.close();
        }
@Test
public void testPassPageMyEmptyPassword()throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPageMy passPageMy=new PassPageMy(driver);
        passPageMy.clickButtonPersonalAccount();
        passPageMy.sendKeysInputLoginOrEmail("login");
        Thread.sleep(1000);
        passPageMy.clickButtonEnter();
        Assertions.assertEquals("Заполните поле",passPageMy.getTextErrorMassagePassword());
        driver.close();
        }
@Test
public void testPassPageMyInvalidValues()throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPageMy passPageMy=new PassPageMy(driver);
        passPageMy.clickButtonPersonalAccount();
        passPageMy.sendKeysInputLoginOrEmail("login");
        Thread.sleep(500);
        passPageMy.sendKeysInputPassword("password");
        Thread.sleep(1000);
        passPageMy.clickButtonEnter();
        Assertions.assertEquals("Пользователь не найден",passPageMy.getTextErrorMassageUserNotFound());
        driver.close();}
}




