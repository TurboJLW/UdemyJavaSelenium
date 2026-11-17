package drivers;

import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

//       ChromeDriver chrome = new ChromeDriver();
//       chrome.get();
//       chrome.findElementBy();
//
//       FirefoxDriver firefox = new FirefoxDriver();
//       firefox.get();
//       firefox.findElementBy();
//
//        WebDriver driver = getDriver("opera");
//        driver.get();
//        driver.findElementBy();

        WebDriver driver = null;
        try {
            driver = getDriver(DriverType.CHROME);
        } catch (NoValidBrowserName e) {
            e.printStackTrace();
        }

//        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.get();
        driver.findElementBy();

    }

//    private static WebDriver getDriver(String name) throws NoValidBrowserName {
//        if (name.equals("chrome")) {
//            return new ChromeDriver();
//        } else if (name.equals("firefox")) {
//            return new FirefoxDriver();
//        }
//        throw new NoValidBrowserName("No valid browser name");
//    }

//    private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
//        if (type==DriverType.CHROME) {
//            return new ChromeDriver();
//        } else if (type==DriverType.FIREFOX) {
//            return new FirefoxDriver();
//        } else if (type==DriverType.OPERA) {
//            ChromeOptions options = new ChromeOptions();
//            return new ChromeDriver(options);
//        }
//        throw new NoValidBrowserName("No valid browser name");
//    }

private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
    if (type.name.equals("chrome")) {
        System.out.println(type.path);
        return new ChromeDriver();
    } else if (type.name.equals("firefox")) {
        System.out.println(type.path);
        return new FirefoxDriver();
    } else if (type.name.equals("opera")) {
        ChromeOptions options = new ChromeOptions();
        System.out.println(type.path);
        return new ChromeDriver(options);
    }
    throw new NoValidBrowserName("No valid browser name");
}

}
