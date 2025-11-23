import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class XpathSearchTest extends BaseTest {

    @Test
    void testLocatorByAttribute() {
        goOnURL();
        boolean isLocatorByAttributeDisplayed =
                driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();

        assertTrue(isLocatorByAttributeDisplayed, "локатор по Attribute не найден");
    }

    @Test
    void testLocatorByText() {
        goOnURL();
        boolean isLocatorByTextDisplayed =
                driver.findElement(By.xpath("//h4[text()='Password for all users:']")).isDisplayed();

        assertTrue(isLocatorByTextDisplayed, "локатор по Text не найден");
    }

    @Test
    void testLocatorByContainsText() {
        goOnURL();
        boolean isLocatorByContainsTextDisplayed =
                driver.findElement(By.xpath("//h4[contains(text(), 'all users')]")).isDisplayed();

        assertTrue(isLocatorByContainsTextDisplayed, "локатор по частичному совпадению текста не найден");
    }

    @Test
    void testLocatorByContainsAttr() {
        goOnURL();
        boolean isLocatorByContainsAttrDisplayed =
                driver.findElement(By.xpath("//input[contains(@class, 'submit-b')]")).isDisplayed();

        assertTrue(isLocatorByContainsAttrDisplayed, "локатор по частичному совпадению аттрибута не найден");
    }

    @Test
    void testLocatorByAncestor() {
        goOnURL();
        boolean isLocatorByAncestorDisplayed =
                driver.findElement(By.xpath("//input[contains(@class, 'submit-b')]//ancestor::form"))
                        .isDisplayed();

        assertTrue(isLocatorByAncestorDisplayed, "локатор по Ancestor не найден");
    }

    @Test
    void testLocatorByDescendant() {
        goOnURL();
        boolean isLocatorByDescendantDisplayed =
                driver.findElement(By.xpath("//div[@class='login-box']//descendant::input[2]"))
                        .isDisplayed();

        assertTrue(isLocatorByDescendantDisplayed, "локатор по Descendant не найден");
    }

    @Test
    void testLocatorByFollowing() {
        goOnURL();
        boolean isLocatorByFollowingDisplayed =
                driver.findElement(By.xpath("//div[@class='login-box']//following::div[1]"))
                        .isDisplayed();

        assertTrue(isLocatorByFollowingDisplayed, "локатор по Following не найден");
    }

    @Test
    void testLocatorByParent() {
        goOnURL();
        boolean isLocatorByParentDisplayed =
                driver.findElement(By.xpath("//input[contains(@class, 'submit-button')]/parent::*"))
                        .isDisplayed();

        assertTrue(isLocatorByParentDisplayed, "локатор по Parent не найден");
    }

    @Test
    void testLocatorOnPreceding() {
        goOnURL();
        boolean isLocatorOnPrecedingDisplayed =
                driver.findElement(By.xpath("//input[contains(@class, 'submit-button')]/preceding::div[3]"))
                        .isDisplayed();

        assertTrue(isLocatorOnPrecedingDisplayed, "локатор по Preceding не найден");
    }

    @Test
    void testLocatorOnConditionAnd() {
        goOnURL();
        boolean isLocatorOnConditionAndDisplayed =
                driver.findElement(By.xpath("//input[@class= 'input_error form_input' and @type='text']"))
                        .isDisplayed();

        assertTrue(isLocatorOnConditionAndDisplayed, "локатор по условию And не найден");
    }
}
