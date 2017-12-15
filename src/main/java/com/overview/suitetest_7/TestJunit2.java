package com.overview.suitetest_7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 15:03
 */
public class TestJunit2 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
