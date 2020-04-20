public class DoubleSuite {

    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("BEFORE SUITE");
    }

    @Test(description = "DoubleTest 1")
    public static void test1() {
        System.out.println("Priority 1");
    }

    @Test(description = "DoubleTest 2", priority = 2)
    public static void test2() {
        System.out.println("Priority 2");
    }

    @Test(description = "DoubleTest 3", priority = 3)
    public static void test3() {
        System.out.println("Priority 3");
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.println("AFTER SUITE");
    }

    @AfterSuite
    public static void afterSuite2() {
        System.out.println("AFTER SUITE");
    }
}
