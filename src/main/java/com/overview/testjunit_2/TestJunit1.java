package com.overview.testjunit_2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 11:28
 */
public class TestJunit1 {

   @Test
    public void testAdd(){
       //test data
       int num= 5;
       String temp= null;
       String str= "Junit is working fine";

       //check for equality
        assertEquals("Junit is working fine", str);

       //check for false condition
        assertFalse(num > 6);

       //check for not null value
       assertNotNull(str);

   }

}
