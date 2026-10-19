package pl.testtw;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThirdTest {

    @Test
    public void firstTest() {
        System.out.println("I am first test");
    }

    @Test
    public void secondTest() {
        System.out.println("I am second test");
    }

    @Test
    public void thirdTest() {
        System.out.println("I am third test");
    }

    @Test(dataProvider = "data")
    public void dpTest(String val, String num) {
        System.out.println(val + " " + num);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][] {{"I am first test","First"},{"I am second test","Second"},{"I am third test","Third"}};
//Test powinien sie uruchomic dla kazdej wartosci po koleji
    }
}
