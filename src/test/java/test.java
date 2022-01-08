import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    @Test
    public void test1() {
        int a = 2;
        int b = 5;
        Assert.assertEquals(11, a + b);
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_modifiers.asp");

        Assert.assertTrue(driver.getCurrentUrl().contains("w3kkkschools"));

    }
}
