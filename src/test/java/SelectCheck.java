//napisz metode ktora przyjmuje String jako parametr i zwraca typ boolean
// metoda sprawdza czy parametr String jest jedną z opcji w Select

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectCheck {

    public boolean isString(String para, Select select){
        for (WebElement webElement : select.getOptions()) {
            if (para.equals(webElement.getText())) {
                System.out.println("This object is on the list");
                return true; }
        } System.out.println("This object is NOT on the list"); return false;
    }

    @Test
    public void IsInSelect() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement basicsLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicsLink.click();

        WebElement carSelector = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(carSelector);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type a string");
//        String userInput = scanner.nextLine();

        isString("Skoda",cars);

    }
}
