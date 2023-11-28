package by.itacademy.ivanchikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPizza extends BaseTest {
    @BeforeEach
    @Test
    public void start() throws InterruptedException {
        driver.get("https://www.pizzatempo.by/");
        PizzaPage pizzaPage=new PizzaPage(driver);
        pizzaPage.clickInputButtonPizza();
        pizzaPage.clickorderPizzaButton();
        pizzaPage.clickorderBtnPizza();
        pizzaPage.clickcartButton();
        pizzaPage.gettextPlacingOrder();
        Thread.sleep(3000);
        Assertions.assertEquals("Оформление заказа",pizzaPage.gettextPlacingOrder());
    }
}