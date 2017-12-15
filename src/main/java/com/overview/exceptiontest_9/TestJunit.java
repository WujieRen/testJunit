package com.overview.exceptiontest_9;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 15:23
 *
 * unit 用代码处理提供了一个追踪异常的选项。你可以测试代码是否它抛出了想要得到的异常。
 *
 * expected 参数和 @Test 注释一起使用。
 *  @Test(expected = ArithmeticException.class)
 */
public class TestJunit {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
