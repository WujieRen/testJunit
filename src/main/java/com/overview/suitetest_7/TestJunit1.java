package com.overview.suitetest_7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 15:01
 *
 * 测试类TestJunit1
 */
public class TestJunit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
