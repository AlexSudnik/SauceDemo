import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class SauceDemoTest extends BaseTest{

    @Test
    void testLocatorById(){
        goOnURL();
        boolean isIdLocatorDisplayed = driver.findElement(By.id("user-name")).isDisplayed();

        assertTrue(isIdLocatorDisplayed, "элемент по ID не найден");
    }

    @Test
    void testLocatorByName(){
        goOnURL();
        boolean isNameLocatorDisplayed = driver.findElement(By.name("login-button")).isDisplayed();

        assertTrue(isNameLocatorDisplayed, "элемент по Name не найден");
    }

    @Test
    void testLocatorByTag(){
        goOnURL();
        boolean isTagNameDisplayed = driver.findElement(By.tagName("h4")).isDisplayed();

        assertTrue(isTagNameDisplayed, "элемент по TagName не найден");
    }

    @Test
    void testLocatorByPartialLinktext(){
        successLogin();
        boolean isPartialLinkTextDisplayed = driver.findElement(By.partialLinkText("Twitter")).isDisplayed();

        assertTrue(isPartialLinkTextDisplayed, "элемент по LinkedText не найден");
    }
}
