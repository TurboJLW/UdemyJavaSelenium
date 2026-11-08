package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

//       ChromeDriver chrome = new ChromeDriver();
//       chrome.get();
//       chrome.findElementBy();
//
//       FirefoxDriver firefox = new FirefoxDriver();
//       firefox.get();
//       firefox.findElementBy();
        
        WebDriver driver = getDriver("opera");
        driver.get();
        driver.findElementBy();



    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }

}
