package com.overview.useassertion_3.Annotation_4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 14:48
 */
public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(JunitAnnotation.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
