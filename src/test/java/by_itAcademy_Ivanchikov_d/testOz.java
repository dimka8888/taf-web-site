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


    public static class PassPageMy {
                private String buttonPersonalAccount = "//[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a/span[2]";
            private String headerTextAutorisation = "//[@id=\"auth-popup\"]/div/div/div[1]/div";
            private String inputLoginOrEmail = "//[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
            private String inputPassword = "//[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
            private String buttonEnter = "//[@id=\"form-auth\"]/fieldset/div[3]/input";
            private String errorMassageLoginOrEmail = "//[@id=\"login-error\"]";
            private String errorMassagePassword = "//[@id=\"password-error\"]";
            private String errorMassageUserNotFound = "//[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
            WebDriver driver;

            public PassPageMy(WebDriver driver) {
                this.driver = driver;
            }
            public void clickButtonPersonalAccount() {
                driver.findElement(By.xpath(buttonPersonalAccount)).click();
            }
            public void clickButtonEnter() {
                driver.findElement(By.xpath(buttonEnter)).click();
            }
            public void sendKeysInputLoginOrEmail(String loginOrEmail) {
                driver.findElement(By.xpath(inputLoginOrEmail)).sendKeys(loginOrEmail);
            }
            public void sendKeysInputPassword(String password) {
                driver.findElement(By.xpath(inputPassword)).sendKeys(password);
            }
            public String getTextHeaderTextAutorisation() {
                return driver.findElement(By.xpath(headerTextAutorisation)).getText();
            }
            public String getTextErrorMassageLoginOrEmail() {
                return driver.findElement(By.xpath(errorMassageLoginOrEmail)).getText();
            }
            public String getTextErrorMassagePassword() {
                return driver.findElement(By.xpath(errorMassagePassword)).getText();
            }
            public String getTextErrorMassageUserNotFound() {
                return driver.findElement(By.xpath(errorMassageUserNotFound)).getText();
            }
        }
}
