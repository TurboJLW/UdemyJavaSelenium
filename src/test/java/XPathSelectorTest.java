import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelectorTest {

    @Test
    public void findElementsXPath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //By użyć Xpath w konsoli przeglądarki, używamy $x
        //e.g. $x("/html/body/button")  podstawowo wygląda to jak ścieżka do folderu, lecz xpath ma o wiele więcej opcji
    }
}
