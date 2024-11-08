import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        WebDriver chromeDriver = getDriver("firefoxome");
        chromeDriver.get("https://google.com");
        System.out.println("Test Hello");
    }

    public WebDriver getDriver(String browser){
        switch (browser){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("Driver" + browser + " is not available. Correct drivers consist of\n" +
                        "chrome\nfirefox\nedge");
        }

    }

}
