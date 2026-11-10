package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        WebDriverManager.chromedriver().setup();
    }

    public ChromeDriver(ChromeOptions options) {
        options = new ChromeOptions();
        options.setBinary("C:\\Users\\janly\\AppData\\Local\\Programs\\Opera GX\\opera.exe");
    }

    @Override
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }

    @Override
    public void get() {
        System.out.println("Wywołanie get()");
    }

    @Override
    public void findElementBy() {
        System.out.println("Wywołanie findElementBy()");
    }
}
