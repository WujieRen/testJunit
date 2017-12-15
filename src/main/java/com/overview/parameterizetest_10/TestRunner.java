package com.overview.parameterizetest_10;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 15:33
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
