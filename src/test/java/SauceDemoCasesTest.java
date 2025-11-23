import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SauceDemoCasesTest extends BaseTest {

    @Test
    void validUsernameAndPasswordTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actualLoginText = driver.findElement(By.cssSelector("[data-test='title']")).getText();
        String expectedLoginText = "Products";

        assertEquals(actualLoginText, expectedLoginText);
    }

    @Test
    void validUsernameAndInvalidPasswordTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("login-button")).click();
        String actualMessageText = driver.findElement(By.cssSelector(".error-message-container")).getText();
        String expectedMessageText = "Epic sadface: Username and password do not match any user in this service";

        assertEquals(actualMessageText, expectedMessageText);
    }
}
