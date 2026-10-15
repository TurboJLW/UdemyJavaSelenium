import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //dodawanie randomowej liczby w celu unikalnosci screenshotow
        int randomNumber = (int) (Math.random()*1000);

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
//        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\janly\\Downloads\\plik.txt");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotBefore = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//        try {
//            FileUtils.copyFile(screenshot,new File("src/test/resources/screenshot.png"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //alternatywne podejscie to np Sikulix, oddzielny program do skryptów

        //Zrzut ekranu z unikalną nazwą
        FileUtils.copyFile(screenshotBefore,new File("src/test/resources/beforeUpload.png"));
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\janly\\Downloads\\plik.txt");
        File screenshotAfter = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAfter,new File("src/test/resources/afterUpload.png"));
    }
}
