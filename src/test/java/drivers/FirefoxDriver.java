package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriver implements WebDriver{
    @Override
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
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
