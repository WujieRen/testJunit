package com.overview.parameterizetest_10;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by renwujie on 2017/12/15 at 15:27
 *
 * Junit 4 引入了一个新的功能参数化测试。参数化测试允许开发人员使用不同的值反复运行同一个测试。你将遵循 5 个步骤来创建参数化测试。
 *
 *      1、用 @RunWith(Parameterized.class) 来注释 test 类。
 *      2、创建一个由 @Parameters 注释的公共的静态方法，它返回一个对象的集合(数组)来为测试数据集合。
 *      3、创建一个公共的构造函数，它接受和一行测试数据相等同的东西。
 *      4、为每一列测试数据创建一个实例变量。【每次执行@Test前限制性@Before创建一个相应的对象】
 *      5、用实例变量作为测试数据的来源来创建你的测试用例。
 *
 *      一旦每行数据出现测试用例将被调用。让我们看看活动中的参数化测试。
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    //Each parameter should be placed as an argument here
    //Every time runner triggers, it will pass the arguments from parameters we defined in primeNumbers() method
    public PrimeNumberCheckerTest(Integer inputNumber,
                                  Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][]{
            { 2, true},
            { 6, false},
            { 19, true},
            { 22, false},
            { 23, true}
        });
    }

    @Test
    public void testPrimeNumberChecker(){
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult,
                primeNumberChecker.validate(inputNumber));
    }

}
