package com.example1.testjuit;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by renwujie on 2017/12/15 at 10:22
 *
 * 由执行结果可以推测，在每个测试用例之前执行setUp()，每个测试用例执行之后，tearDown()会执行。
 *
 * 由此重构：用成员变量生成对象（为了能在每个方法中都用到），将生成对象的语句放在setUp()中。
 *
 */
public class CalculatorTest2 extends TestCase {
    public void testAdd()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(3, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testSubtract()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testMultiply()
    {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        // 判断方法的返回结果
        Assert.assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testDivide()
    {
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 3);
        // 判断方法的返回结果
        Assert.assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("set up");
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tear down");
    }
}
