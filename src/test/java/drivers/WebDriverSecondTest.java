package drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();

        //co jesli chcemy dodac wiecej klas, np dla safari? mozna po prostu dodac taka klase
        //ale mozna takze dodac klase anonimowa, nie bedzie mozna jej reuzywac jak powyzej.
        //Klasa anonimowa to klasa definiowana w kodzie, ktora ma dokladnie jedna instancje (dokladnie 1 obiekt)
        //Trzeba stworzyć obiekt i nazwe interfejsu ktory ma ta klasa implementowac

        WebDriver safari = new WebDriver() {
            @Override
            public void setup() {
                System.out.println("Wywołanie anonimowego setup()");
            }

            @Override
            public void get() {
                System.out.println("Wywołanie anonimowego get()");
            }

            @Override
            public void findElementBy() {
                System.out.println("Wywołanie anonimowego findElementBy()");
            }
        };

        // WebDriver safari  <-- ten zapis nie dziala, poniewaz mamy dokladnie 1 obiekt, natomiast samego obiektu mozemy uzyc
        safari.get();
        safari.findElementBy();

        //Wyrażenie lambda to krótka forma zapisania klasy anonimowej, ale klasy anonimowej, która jest implementacją interfejsu
        //posiadającego tylko i wyłącznie jedną metodę.
    }
}
