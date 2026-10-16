import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {

    @Test
    public void mouseActions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();

        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        actions.doubleClick(button).perform();

        //button.click();
        //button.click();
        //klikanie dwa razy nie działa, chociaż test przechodzi
    }
}
