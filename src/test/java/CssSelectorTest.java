import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CssSelectorTest extends BaseTest{

    @Test
    void testLocatorByClass(){
        goOnURL();
        boolean isLocatorByClassDisplayed = driver.findElement(By.cssSelector(".submit-button")).isDisplayed();

        assertTrue(isLocatorByClassDisplayed, "локатор по Классу не найден");
    }

    @Test
    void testLocatorBy2Classes(){
        goOnURL();
        boolean isLocatorBy2ClassesDisplayed = driver.findElement(By.cssSelector(".submit-button.btn_action"))
                .isDisplayed();

        assertTrue(isLocatorBy2ClassesDisplayed, "локатор по второму из двух классов не найден");
    }

    @Test
    void testLocatorByInnerClass(){
        goOnURL();
        boolean isLocatorByInnerClassDisplayed = driver.findElement(By.cssSelector(".form_group .input_error"))
                .isDisplayed();

        assertTrue(isLocatorByInnerClassDisplayed, "локатор по вложенному классу не найден");
    }

    @Test
    void testLocatorById(){
        goOnURL();
        boolean isLocatorByIdDisplayed = driver.findElement(By.cssSelector("#user-name")).isDisplayed();

        assertTrue(isLocatorByIdDisplayed, "локатор по ID не найден");
    }

    @Test
    void testLocatorByTagName(){
        goOnURL();
        boolean isLocatorByTagNameDisplayed = driver.findElement(By.cssSelector("input")).isDisplayed();

        assertTrue(isLocatorByTagNameDisplayed, "локатор по Tagname не найден");
    }

    @Test
    void testLocatorByTagAndClass(){
        goOnURL();
        boolean isLocatorByTagAndClassDisplayed = driver.findElement(By.cssSelector("input.submit-button")).isDisplayed();

        assertTrue(isLocatorByTagAndClassDisplayed, "локатор по Tag+class не найден");
    }

    @Test
    void testLocatorByFullAttribute(){
        goOnURL();
        boolean isLocatorByFullAttributeDisplayed = driver.findElement(By.cssSelector("[data-test='login-button']"))
                .isDisplayed();

        assertTrue(isLocatorByFullAttributeDisplayed, "локатор по аттрибуту не найден");
    }

    @Test
    void testLocatorByPartAttrib(){
        goOnURL();
        boolean isLocatorByPartAttribDisplayed = driver.findElement(By.cssSelector("[data-test~='login-button']"))
                .isDisplayed();

        assertTrue(isLocatorByPartAttribDisplayed,"локатор по части аттрибута не найден");
    }

    @Test
    void LocatorByVerticalBar(){
        successLogin();
        boolean isLocatorByVerticalBarDisplayed = driver.findElement(By.cssSelector("[data-test|='social']"))
                .isDisplayed();

        assertTrue(isLocatorByVerticalBarDisplayed, "локатор по | не найден");
    }

    @Test
    void LocatorByBeginning(){
        successLogin();
        boolean isLocatorByBeginningDisplayed = driver.findElement(By.cssSelector("[href^='https://twitter']"))
                .isDisplayed();

        assertTrue(isLocatorByBeginningDisplayed, "локатор по началу аттрибута не найден");
    }

    @Test
    void LocatorByEnding(){
        successLogin();
        boolean isLocatorByEndingDisplayed = driver.findElement(By.cssSelector("[href$='tter.com/saucelabs']"))
                .isDisplayed();

        assertTrue(isLocatorByEndingDisplayed, "локатор по окончанию аттрибута не найден");
    }

    @Test
    void LocatorByContains(){
        successLogin();
        boolean isLocatorByContainsDisplayed = driver.findElement(By.cssSelector("[href*='facebook.co']"))
                .isDisplayed();

        assertTrue(isLocatorByContainsDisplayed, "локатор по содержанию части текста в ссылке не найден");
    }
}

