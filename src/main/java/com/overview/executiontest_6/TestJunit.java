package com.overview.executiontest_6;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by renwujie on 2017/12/15 at 14:58
 *
 * 测试用例类
 */
public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}
