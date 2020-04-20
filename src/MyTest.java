public class MyTest {

    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("BEFORE SUITE");
    }

    @Test(description = "MyTest1")
    public static void test1() {
        System.out.println("TEST 1 >> Priority 1");
    }

    @Test(description = "MyTest2", priority = 2)
    public static void test2() {
        System.out.println("TEST 2 >> Priority 2");
    }

    @Test(description = "MyTest3", priority = 3)
    public static void test3() {
        System.out.println("TEST 3 >> Priority 3");
    }

    @Test(description = "MyTest4", priority = 4)
    public static void test4() {
        System.out.println("TEST 4 >> Priority 4");
    }

    @Test(description = "MyTest5", priority = 5)
    public static void test5() {
        System.out.println("TEST 5 >>>> Priority 5");
    }

    @Test(description = "MyTest6", priority = 6)
    public static void test6() {
        System.out.println("TEST 6 >> Priority 6");
    }

    @Test(description = "MyTest7", priority = 7)
    public static void test7() {
        System.out.println("TEST 7 >> Priority 7");
    }

    @Test(description = "MyTest8", priority = 8)
    public static void test8() {
        System.out.println("TEST 8 >> Priority 8");
    }

    @Test(description = "MyTest9", priority = 9)
    public static void tes9() {
        System.out.println("TEST 9 >> Priority 9");
    }

    @Test(description = "MyTest10", priority = 10)
    public static void test10() {
        System.out.println("TEST 10 >> Priority 10");
    }

    @Test(description = "MyTest11", priority = 5)
    public static void test11() {
        System.out.println("TEST 11 >>> Priority 5");
    }

    @AfterSuite
    public static void afterSuite2() {
        System.out.println("AFTER SUITE");
    }
}
