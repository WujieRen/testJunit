package com.overview.useassertion_3.Annotation_4;

import org.junit.*;

/**
 * Created by renwujie on 2017/12/15 at 14:44
 * 1、@Test
 * 这个注释说明依附在 JUnit 的 public void 方法可以作为一个测试案例
 * 2	@Before
 * 有些测试在运行前需要创造几个相似的对象。在 public void 方法加该注释是因为该方法需要在 test 方法前运行。
 * 3	@After
 * 如果你将外部资源在 Before 方法中分配，那么你需要在测试运行后释放他们。在 public void 方法加该注释是因为该方法需要在 test 方法后运行。
 * 4	@BeforeClass
 * 在 public void 方法加该注释是因为该方法需要在类中所有方法前运行。
 * 5	@AfterClass
 * 它将会使方法在所有测试结束后执行。这个可以用来进行清理活动。
 * 6	@Ignore
 * 这个注释是用来忽略有关不需要执行的测试的。
 */
public class JunitAnnotation {
    //execute before class
    @BeforeClass
    public static void beforeClass(){
        System.out.println("in before class");
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case
    @Test
    public void test() {
        System.out.println("in test");
    }

    //test case ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }

}
