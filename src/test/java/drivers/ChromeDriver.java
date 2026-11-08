package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver implements WebDriver{
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
