import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

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

        WebElement rulesCheckbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        rulesCheckbox.click();

        WebElement radioButton = driver.findElement(By.cssSelector("input[value='male']"));
        radioButton.click();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByIndex(2);
        cars.selectByVisibleText("Saab");
        cars.selectByValue("volvo");
        cars.selectByContainsVisibleText("es");

        //Pobranie opcji z selecta - Trzeba użyć get text
        List<WebElement> optionsList = cars.getOptions();
        System.out.println(optionsList.size());
        for (WebElement webElement : optionsList) {
            System.out.println(webElement.getText());

        }

    }
}
