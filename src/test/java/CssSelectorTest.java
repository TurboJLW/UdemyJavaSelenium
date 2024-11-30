import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {

    @Test
    public void findElementsCss(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //By Id (when using cssSelector use # before Id name)
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //By Class (when using cssSelector use . before class name)
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //By Tag (no additional character needed)
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Pierwszy");

        //By Name - search is done with this syntax: "[x='y']"
        // attribute x has value of y
        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        //By Class with Search
        By cssClass2 = By.cssSelector("[class='tableHeader']");
        driver.findElement(cssClass2);

        //By szybko veryfikować selektory css za pomocą devTools, w konsoli przeglądarki wpisz $$("twójSelektor")
        //Syntax jest taki sam w przeglądarce jak i selenium

        //Wszystkie elementy na stronie
        By all = By.cssSelector("*");
        driver.findElements(all);

        //W selektorach css można używać tagów html oddzielając je spacją
        //By wywołać wszystkie elementy w liście używamy "div ul"
        //By wywołać wszystkie elementy w tabeli używamy "table tr" itd.
        By ulInsideDiv = By.cssSelector("div ul");
        By trInsideTable = By.cssSelector("table tr");
        By trInsideTBody = By.cssSelector("tbody tr");

        driver.findElements(ulInsideDiv);
        driver.findElements(trInsideTable);
        driver.findElements(trInsideTBody);

        //Chcemy znaleźć listę która jest bezpośrednim dzieckiem elementu "div". Selektor jest jak wcześniej,
        //lecz dodajemy znak większości pomiędzy:  div > ul
        //Takie rozróznianie nie działa dziedzicznie i można nim sprawdzić tylko pierwsze dziecko poniżej
        By divChildUl = By.cssSelector("div > ul");
        By tbodyChildTr = By.cssSelector("tbody > tr");

        driver.findElements(divChildUl);
        driver.findElements(tbodyChildTr);

        //Chcemy znaleźć pierwszy tag form który występuje po tagu label
        //aby to zrobić korzystamy z plusa "+", ten plus oznacza element występujący PO elemencie, w równej hierarchi
        By firstFormAfterLabel = By.cssSelector("label + form");
        driver.findElement(firstFormAfterLabel);

        //Jeśli chcemy zwrócić WSZYSTKIE elementy po tagu label używamy tyldy "~"
        By allFormAfterLabel = By.cssSelector("label ~ form");
        driver.findElements(allFormAfterLabel);


    }
}
