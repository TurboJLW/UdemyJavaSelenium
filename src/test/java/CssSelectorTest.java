import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {

    @Test
    public void findElementsCss(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //By Id (when using cssSelector use # before Id name)
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //By Class (when using cssSelector use . before class name)
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //By Tag (no additional character needed)
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Pierwszy");

        //By Name - search is done with this syntax: "[x='y']"
        // attribute x has value of y
        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

    }
}
