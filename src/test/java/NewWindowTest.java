import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowTest {

    @Test
    public void testNewWindow() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentWindow = driver.getWindowHandle();

//        WebElement basicsLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
//        basicsLink.click();

        driver.findElement(By.id("newPage")).click();
        //Tworzymy Set stringów
        Set<String> windowsNames = driver.getWindowHandles();

        //Za każdy string "window" we wcześniej utworzonej tabeli "windowNames" patrzymy na różne okna inne od aktualnego
        //i przełączamy w przypadku znalezienia
        for(String window : windowsNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }

        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        //Operacje na pierwotnym oknie
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Dżoni");
    }
}
