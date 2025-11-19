import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends BaseTest {

    String expectedSauceLabsBackpackPrice = "$29.99";
    String expectedSauceLabsBackpackPriceName = "Sauce Labs Backpack";

    @Test
    void testProductName(){
        successLogin();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        String actualProductName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();

        assertEquals(expectedSauceLabsBackpackPriceName, actualProductName);
    }

    @Test
    void testProductPrice(){
        successLogin();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        String actualProductPrice = driver.findElement(By.cssSelector(".inventory_item_price")).getText();

        assertEquals(expectedSauceLabsBackpackPrice, actualProductPrice);
    }
}
