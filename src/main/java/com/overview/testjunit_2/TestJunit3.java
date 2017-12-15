package com.overview.testjunit_2;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;
/**
 * Created by renwujie on 2017/12/15 at 13:51
 */
public class TestJunit3 extends TestResult {

    // add the error
    @Override
    public synchronized void addError(Test test, Throwable t) {
        super.addError(test, t);
    }

    // add the failure
    @Override
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure(test, t);
    }

    @org.junit.Test
    public void testAdd(){

    }

    // Marks that the test run should stop.
    @Override
    public synchronized void stop() {
        super.stop();
    }
}
