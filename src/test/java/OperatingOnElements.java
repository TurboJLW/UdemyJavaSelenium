import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
    Notes:
    1. If possible use ID, if an element has it and its not automatically generated
    2. Else, we verify if an element has an attribute name and if its UNIQUE
        e.g. By elementWithAttribute = By.xpath("(//button[@name='buttonName'])");
    3. For links, methods dedicated to them seem to be most efficient:
        e.g.  By findW3SchoolText = By.linkText("Visit W3Schools.com!");
        and   By findW3SchoolPartialLinkText = By.partialLinkText("W3Schools.");
    4. If none above are usable, CSS are fairly complex and precise
        e.g. By attributeTag = By.cssSelector("input[name='fname']");
             By attributeContains = By.cssSelector("[name*='name']");
             By trInsideTable = By.cssSelector("table tr");
             By divChildUl = By.cssSelector("div > ul");
             By firstFormAfterLabel = By.cssSelector("label + form");
    5. Despite XPath being the slowest, it lets me create most complex selectors:
        e.g. By xPathNameContains = By.xpath("//*[contains(@name,'ame')]"); (NOT LINKS)
        By xPathAsnscestor = By.xpath("//div/ancestor::*"); (finding Anscestors/Parents of an element)
        By xPathDoubleDot = By.xpath("//div/../.."); (directly addressing elements in a folder above)
        By xPathPreceding = By.xpath("//img/preceding::*");
        By xPathPrecedingSibling = By.xpath("//img/preceding-sibling::*"); (finding elements preceding an element in
        the structure, as well as ones staying on the same level)
        and many more.
 */

public class OperatingOnElements {

    @Test
    public void OperatingOnElementsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
    }
}
