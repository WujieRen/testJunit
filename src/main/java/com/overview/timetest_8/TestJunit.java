package com.overview.timetest_8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 15:19
 *
 * unit 提供了一个暂停的方便选项。
 * 如果一个测试用例比起指定的毫秒数花费了更多的时间，那么 Junit 将自动将它标记为失败。
 * timeout 参数和 @Test 注释一起使用。  @Test(timeout=Num)
 */
public class TestJunit {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(timeout=1000)
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
