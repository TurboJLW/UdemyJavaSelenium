import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicActionsTest {

    @Test
    public void performAction() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicsLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicsLink.click();
        driver.findElement(By.id("fname")).sendKeys("Janek");

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("JanekTW");
        usernameInput.sendKeys(Keys.TAB);
        usernameInput.sendKeys(Keys.TAB);
        //Drugi TAB nie przechodzi na kolejny element ponieważ jest wykonywany na elemencie usernameInput!

        //WebElement submitButton = driver.findElement(By.className("input"));
        //submitButton.click();

        //WebElement xpathSubmitButton = driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
        //WebElement xpathSubmitButton = driver.findElement(By.xpath("//*[contains(@value,'Submit')]"));
        //xpathSubmitButton.click();


    }
}
