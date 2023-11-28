package by.itacademy.ivanchikov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaPage {
    private String inputButtonPizza = "/html/body/div/div[3]/ul/li[1]/a/img";
    private String orderPizzaButton = "//*[@id=\"1\"]/div/div[2]/div[3]/div[3]/button/span/span";
    private String orderBtnPizza = "//*[@id=\"order_pizza_popup\"]/div[2]/div[2]/div[2]/div[1]/div[3]/div[4]/button";
    private String cartButton = "//*[@id=\"basket_placeholder\"]/div/div/div[1]/div[1]/a/span/span";
    private String textPlacingOrder="/html/body/div[1]/div[5]/div[2]/div[1]/h1";

    private WebDriver driver;

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickInputButtonPizza(){
        driver.findElement(By.xpath(inputButtonPizza)).click();
    }
    public void clickorderPizzaButton(){
        driver.findElement(By.xpath(orderPizzaButton)).click();
    }
    public void clickorderBtnPizza(){
        driver.findElement(By.xpath(orderBtnPizza)).click();
    }
    public void clickcartButton(){
        driver.findElement(By.xpath(cartButton)).click();
    }
    public Object gettextPlacingOrder(){
        driver.findElement(By.xpath(textPlacingOrder)).getText();
        return null;
    }
}
