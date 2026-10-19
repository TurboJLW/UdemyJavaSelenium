package pl.testtw;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am running before suit");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am running before class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am running after suit");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am running after class");
    }

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
