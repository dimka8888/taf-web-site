package by_ITAcademe_Ivanchikov_d;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassPage {
    public String inputButtonMain = "/html/body/div[1]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    public String tabLinkEmail="//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]";
    public String inputTextEmail ="//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";

    public String inputButtonForm = "";
    public String textError ="//*[@id=\"password-error\"]";

    WebDriver driver;

    public PassPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInputButtonMain() {
        WebElement inputButtonMainElenent = driver.findElement(By.xpath(inputButtonMain));
        inputButtonMainElenent.click();
    }
    public void clickTabLinkEmail() {
        WebElement tabLinkEmailElement = driver.findElement(By.xpath(tabLinkEmail));
        tabLinkEmailElement.click();    }
    public void clickButtonForm() {
        WebElement inputButtonFormElement = driver.findElement(By.xpath(inputButtonForm));
        inputButtonFormElement.click();    }
    public String getTextError() {

        WebElement textErrorElement = driver.findElement(By.xpath(textError));
        String actualError = textErrorElement.getText();
        return null;    }



}