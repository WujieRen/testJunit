package com.overview.executeprocess_5;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 14:54
 */
public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(ExecutionProcedureJunit.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
