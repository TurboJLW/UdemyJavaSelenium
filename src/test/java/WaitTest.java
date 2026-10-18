import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
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
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //w przypadku FluentWait trzeba zadeklarowac typ przekazywany do konstruktora
        //Fluent wait domyślnie nie ignoruje wyjątków, trzeba te ignorowane wyjątki zdefiniować, tak samo jak timeout.
        FluentWait <WebDriver> wait = new FluentWait<>(driver);
        //webdriverwait ma domyślnie zdefiniowane wyjatki, fluentwait tego nie ma
        //jezeli chcemy by fluent wait ignorowal wyjatek, to trzeba recznie dodac taki warunek

        wait.withTimeout(Duration.ofSeconds(10));
        //visibilityOf nie jest tak dobre jak visibilityOfElementLocated, ponieważ druga funkcja upewnia się,
        // że element jest zlokalizowany na stronie i pozwala na czekanie
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Dopiero się pojawiłem!']")));
        //Visibility sprawdza czy element jest w strukturze i czy jest widoczny dla uzytkownika
        //aby sprawdzic ze element ISTNIEJE w strukturze, używamy presenceOfElementLocated
        //Locator jest zawsze bezpieczniejszy do przekazywania niż WebElement, ponieważ nawet jeśli nie istnieje na stronie, to będziemy na niego czekać.
        //Używaj findElement jeśli masz PEWNOŚĆ, że element jest na stronie.
        //Przykładowe Locatory:
        //By.id, by.xpath, by.cssSelector
        //findElement(By.id("username")) od razu wyszukuje element i jesli nie wystapi to moze wyrzucic blad

        driver.findElement(By.xpath("//p[normalize-space()='Dopiero się pojawiłem!']"));

    }
}
