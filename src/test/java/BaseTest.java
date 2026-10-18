import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void BeforeTest() {
        System.out.println("I am running before test");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("I am running before method");
    }
}
