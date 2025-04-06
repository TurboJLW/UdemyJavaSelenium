import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XPathSelectorTest {

    @Test
    public void findElementsXPath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //By użyć Xpath w konsoli przeglądarki, używamy $x
        //e.g. $x("/html/body/button")  podstawowo wygląda to jak ścieżka do folderu, lecz xpath ma o wiele więcej opcji
        //Korzystanie z pojedyńcych slashy / nie jest najlepszą praktyką, jesli cokolwiek się zmieni w strukturze html,
        //to selektor przestanie działać
        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        //Z pomocą przychodzi podwójny slash '//'
        //Efekt wyszukiwania $x("/html/body/table/tbody/tr") oraz $x("//tr") jest taki sam, pierwszy zapis jest dokładniejszy
        //użycie zapisu z //tr pozwoli na zwrócenie wszystkich tagów tr w strukturze (jak w $$("tr") )
        //podwójnego slasha można także użyć w środku komendy $x("/html/body/table//tr") by znaleźć zawężone wyniki
        By preciseXPath = By.xpath("/html/body/div//ul");
        By shortPath = By.xpath("//ul");
        driver.findElement(preciseXPath);
        driver.findElements(shortPath);

        //Ze względu na możliwości Xpatha szukanie elementów można wykonać na wiele sposobów. Postaraj się wybierać te
        //najbardziej pasujące dla twoich potrzeb (full xPath,full+shortened,short,search,with function)

        //Syntax for attribute search: [@x='y']
        // @ <- marking following string as attribute name
        // x <- attribute name
        // y <- value of the attribute
        //clickOnMe
        By buttonID = By.xpath("/html/body/button[@id='clickOnMe']");
        //Ponieważ struktura wyrażenie xpath ma w sobie wyszukiwanie, precyzyjne podawanie xpatha pewnie nie jest konieczne
        buttonID = By.xpath("//button[@id='clickOnMe']");
        driver.findElement(buttonID);

        //fname
        By firstName = By.xpath("//input[@name='fname']");
        driver.findElement(firstName);

        //topSecret
        By topSecret = By.xpath("//p[@class='topSecret']");
        driver.findElement(topSecret);

        //input
        By inputXpath = By.xpath("//input");
        driver.findElement(inputXpath).sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputXpath);
        System.out.println(inputs.size());

        //linkText, using text() method, which finds the exact matching string
        By xPathW3SchoolText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement xPathText = driver.findElement(xPathW3SchoolText);

        /*
        By findW3SchoolPartialLinkText = By.partialLinkText("W3Schools.");
        xPathText = driver.findElement(findW3SchoolPartialLinkText); -
        //this is only for reference as it is a Selenium selector function
         */

        By xPathContainsText = By.xpath("//a[contains(text(),'Visit')]");
        WebElement linkContainsVisit = driver.findElement(xPathContainsText);

        //Aby wybrać ktorys element z listy (w konsoli przegladarki) należy w nawiasach okrągłych () zamknąć selektor po
        //którym chcemy wyszukiwać i w nawiasach kwadratowych [] wpisać index (licząc od 1)
        // $x oraz $$ sluza tylko do wyszukiwania w konsoli przegladarki
        // e.g. $x("(//input)[2]")
        //
        // dodatkowo w miejscu indexu można wpisywać funkcje first() i last() aby zwrócić pierwszy i ostatni element
        //
        //Można także użyć kwadratowych nawiasów by przeszukać całą listę w poszukiwaniu elementu z atrybutem o danej nazwie
        // e.g. $x("//*[@name]"), $x("//*[@id]")
        // $x("//button[@id]")
        // jest to przerobiony selektor wyszukujący atrybut o konkretnej nazwie:
        // $x("//*[@name='fname']")
        //
        //wyszukiwania te mozna laczyc
        // $x("(//button[@id])[1]")
        // $x("(//button[@id])[last()]")

        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute = By.xpath("(//*[@id])");
        driver.findElements(elementWithAttribute);


        By xPathNameContains = By.xpath("//*[contains(@name,'ame')]");
        driver.findElement(xPathNameContains);

        By xPathStartsWith = By.xpath("//*[starts-with(@name, 'u')]");
        driver.findElement(xPathStartsWith);

        // for Xpath 2.0 this will work, but if xpath 1.0 is used, then to search using string that ends with you have to use substring
        //By xPathEndsWith = By.xpath("//*[ends-with(@name, 'me')]");

        By xPathEndsWith = By.xpath("//*[substring(@name, string-length(@name) - string-length('me') + 1) = 'me']");
        driver.findElement(xPathEndsWith);

        //Even more XPath Selectors

        //use child to find direct children of an element specified before and use :: to search for that element
        By xPathChildElement = By.xpath("//div/child::ul");
        driver.findElement(xPathChildElement);

        //use descendants to search for ALL children, grandchildren etc.
        By xPathDescendants = By.xpath("//div/descendant::*");
        driver.findElements(xPathDescendants);

        //use ancestor to search for ALL parents, grandparents etc.
        By xPathAsnscestor = By.xpath("//div/ancestor::*");
        driver.findElements(xPathAsnscestor);

        //use .. to search for an element in the "folder" above
        By xPathDoubleDot = By.xpath("//div/../..");
        driver.findElement(xPathDoubleDot);

        //use following to get all elements that are place after the searched element in html structure
        //preceding for all elements before
        By xPathFollowing = By.xpath("//img/following::*");
        driver.findElement(xPathFollowing);

        //add -sibling to find all elements that precede or follow an element, but stay on the same level
        By xPathSibling = By.xpath("//img/following-sibling::*");
        driver.findElement(xPathSibling);

        By xPathPreceding = By.xpath("//img/preceding::*");
        By xPathPrecedingSibling = By.xpath("//img/preceding-sibling::*");


    }
}
