package com.overview.testjunit_2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 13:54
 */
public class TestRunner3 {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestJunit3.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
