import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class XpathTest extends BaseTest{

    @Test
    void testLocatorByAttribute(){
        goOnURL();
        boolean isLocatorByAttributeDisplayed = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();

        assertTrue(isLocatorByAttributeDisplayed, "локатор по Attribute не найден");


    }
}
