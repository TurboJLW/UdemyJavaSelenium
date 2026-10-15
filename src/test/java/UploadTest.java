import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadTest {

    @Test
    public void uploadFile(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\janly\\Downloads\\plik.txt");

        //alternatywne podejscie to np Sikulix, oddzielny program do skryptów
    }
}
