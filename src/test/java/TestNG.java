import org.testng.annotations.*;


/**
 * Created by timoha on 28.04.2016.
 */
public class TestNG {

    @BeforeGroups("shopping")
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups("shopping")
    public void afterGroups() {
        System.out.println("@After Groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("@BeforeTestMethod");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("@AfterTestMethod");
    }


    @Test(priority = 3)
    public void runTest1() {
        System.out.println("Test1 - groups shoping");
    }

    @Test(priority = 1)
    public void runTest2() {
        System.out.println("Test2 - no groups");
    }

    @Test(priority = 4)
    public void runTest3() {
        System.out.println("Test3 - groups merch");
    }
}
