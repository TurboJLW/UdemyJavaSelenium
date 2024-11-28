import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        By firstName = By.name("fname");
        WebElement firstNameField = driver.findElement(firstName);
        //można to zapisywać bez deklaracji zmiennej, tzn od razu użyć metody findElement
        driver.findElement(By.name("fname"));

        //class
        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);

        //tag
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        //możemy mieć wiele elementów o danym tagu (tak jak w przypadku input). Do tego używamy findElements <
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

//        for (WebElement webElement : inputs){
//            System.out.println(webElement);
//        }
        System.out.println("Test Finished");
    }


}
