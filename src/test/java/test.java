import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test(groups = "smoke")
    public void test1() {
        int a = 2;
        int b = 5;

        Assert.assertEquals(7, a + b,"toplama isleminde hata var mi");
        Assert.assertEquals(3, b-a,"cikarma isleminde hata var mi");

    }

    @Test(groups = "smoke")
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_modifiers.asp");

        Assert.assertTrue(driver.getCurrentUrl().contains("w3kkkschools"),"websitesinde hata var");

    }
}
