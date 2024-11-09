import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        Dimension dimension = new Dimension(800,600);
        driver.manage().window().setSize(dimension);
        driver.get("https://google.com");
    /*
    Java script executor, only for showcase of close() and quit() methods difference
    driver can be cast using ((JavascriptExecutor)driver).
    but can be also done regularly with
    JavascriptExecutor executor = (JavascriptExecutor) driver;
     */
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://x.com','blank','height=800','width=600')");
        driver.close();

//        driver.close();
//        driver.quit();
        System.out.println("Test Finished");
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
