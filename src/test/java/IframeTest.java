import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class IframeTest {

    @Test
    public void testNewWindow() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        //driver.switchTo().frame("wartosc id lub wartosc name"); //uzywalne gdy ktorys z tych atrybutow jest w iframe

        //driver.switchTo().frame(0);
        driver.findElement(By.id("fname")).sendKeys("Dżoni");
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        //powrót do pierwotnej zawartości:
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
