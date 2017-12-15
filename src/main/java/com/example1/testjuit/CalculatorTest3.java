package com.example1.testjuit;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by renwujie on 2017/12/15 at 10:28
 */
public class CalculatorTest3 extends TestCase {

    private Calculator calculator;

    public void testAdd() {
        int result = calculator.add(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(3, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testSubtract() {
        int result = calculator.subtract(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        // 判断方法的返回结果
        Assert.assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testDivide() {
        int result = calculator.divide(12, 3);
        // 判断方法的返回结果
        Assert.assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("tear down");
        Calculator calculator = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tear down");
    }
}
