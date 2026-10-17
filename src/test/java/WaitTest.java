import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {

    WebDriver driver;

    @Test
    public void waitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Czekanie implicit - domyślne - dla wszystkich elementów na stronie
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.xpath("//p[normalize-space()='Dopiero się pojawiłem!']"));



    }
}
