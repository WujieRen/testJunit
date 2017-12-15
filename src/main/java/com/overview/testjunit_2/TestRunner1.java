package com.overview.testjunit_2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 11:32
 */
public class TestRunner1 {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestJunit1.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
