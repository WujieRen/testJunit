package com.overview.testjunit_2;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by renwujie on 2017/12/15 at 11:36
 */
public class TestJunit2 extends TestCase {
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setUp(){
        fValue1= 2.0;
        fValue2= 3.0;
    }

    @Test
    public void testAdd(){
        //count the number of test cases
        System.out.println("No of Test Case = " + this.countTestCases());
        //test getName
        System.out.println("Test Case Name = " + this.getName());
        //test
        // setName
        this.setName("newName");
        System.out.println("Update Test Name = " + this.getName());

    }

    //tearDown used to close the connection or clean up activities
    public void tearDown(){

    }

}
