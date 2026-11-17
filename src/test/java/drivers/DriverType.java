package drivers;

public enum DriverType {

    CHROME("chrome","/src/resources/chromedriver.exe"),
    FIREFOX("firefox","/src/recources/firefoxdriver.exe"),
    OPERA("opera","/src/recouces/chromedriver.exe");

    String name;
    String path;

    DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }

}
