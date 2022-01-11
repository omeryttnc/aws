package urbanicfarm.tests.suite1;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import urbanicfarm.config.TestResultLoggerExtension;
import urbanicfarm.tests.BrowserTestBase;

@SpringBootTest
@Epic("EP001")
@Story("US002")
@ExtendWith(TestResultLoggerExtension.class)
public class test extends BrowserTestBase {
    @Test()
    public void test1() {
        int a = 2;
        int b = 5;

        Assertions.assertEquals(7, a + b, "toplama isleminde hata var mi");
        Assertions.assertEquals(3, b - a, "cikarma isleminde hata var mi");

    }

    @Test()
    public void test2() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test3() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test4() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test5() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test6() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test7() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test8() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
    @Test()
    public void test9() {
        webDriverForTest.getDriver().get("https://www.w3schools.com/java/java_modifiers.asp");
        Assertions.assertTrue(webDriverForTest.getDriver().getCurrentUrl().contains("w3schools"), "websitesinde hata var");

    }
}
