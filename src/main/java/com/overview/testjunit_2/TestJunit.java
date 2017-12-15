package com.overview.testjunit_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by renwujie on 2017/12/15 at 10:34
 *
 * 创建 Test Case 类
    创建一个名为 TestJunit.java 的测试类。
    向测试类中添加名为 testPrintMessage() 的方法。
    向方法中添加 Annotaion @Test。
    执行测试条件并且应用 Junit 的 assertEquals API 来检查。
 */
public class TestJunit {
    /*@Test
    public void testEquals(){
        String str= "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }

    @Test
    public void testTrue(){
        int b = 1;
        assertTrue(b == 2);
    }*/

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        message = "new World";
        assertEquals(message, messageUtil.printMessage());
    }

}
