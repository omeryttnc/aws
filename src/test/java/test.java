import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    @Test(groups = "smoke")
    public void test2() {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions optionsAWS = new ChromeOptions();
        optionsAWS.addArguments("disable-gpu");
        optionsAWS.setHeadless(true);
        optionsAWS.addArguments("--no-sandbox");
        optionsAWS.addArguments("headless");
        optionsAWS.addArguments("--disable-dev-shm-usage");
        optionsAWS.addArguments("--disable-extensions");
        optionsAWS.addArguments("--allow-insecure-localhost");
        optionsAWS.addArguments("--single-process");
        webDriver.set(new ChromeDriver(optionsAWS));

        webDriver.get().get("https://www.w3schools.com/java/java_modifiers.asp");


        Assert.assertTrue(webDriver.get().getCurrentUrl().contains("w3sggchools"),"websitesinde hata var");

    }
}
