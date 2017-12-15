package com.overview.suitetest_7;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 15:05
 */
public class TestRunner {
    public static void main(String[] args){
        //这里参数一开始写成了 TestJunit2.class 后来改名字改错了，结果这里也被修改了，运行结果仍不是自己想要的
        //发现有个新思维，暂且起名教相关性思维。这个其实能和我的底层世界观结合在一起看，最终的状态一定时多个因素作用的结果。这个过程中，找到和结果相关的每一个因素就很重要。
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
