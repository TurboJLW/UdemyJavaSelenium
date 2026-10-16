import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementExistsTest {

    WebDriver driver;

    @Test
    public void elementExistsTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(elementExists(By.tagName("p")));
        System.out.println(elementExists(By.id("topSecret")));

        System.out.println(elementsExist(By.tagName("p")));
        System.out.println(elementsExist(By.id("topSecret")));

        //Czy element jest wyświetlony na stronie (nie jest hidden)
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());

    }

    public boolean elementExists(By locator){
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    //alternatywnie, gdyby było wiele elementów
    public boolean elementsExist(By locator){
        return !driver.findElements(locator).isEmpty();
    }
}
