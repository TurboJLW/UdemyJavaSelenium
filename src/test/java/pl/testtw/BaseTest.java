package pl.testtw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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

    @AfterTest
    public void AfterTest() {
        System.out.println("I am running after test");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("I am running after method");
    }
}
