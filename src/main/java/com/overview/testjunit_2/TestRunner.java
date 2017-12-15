package com.overview.testjunit_2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by renwujie on 2017/12/15 at 10:41
 *
 * 创建 Test Runner 类
    创建一个 TestRunner 类
    运用 JUnit 的 JUnitCore 类的 runClasses 方法来运行上述测试类(TestJunit)的测试案例
    获取在 Result Object 中运行的测试案例的结果
    获取 Result Object 的 getFailures() 方法中的失败结果
    获取 Result object 的 wasSuccessful() 方法中的成功结果
 */
public class TestRunner {
    public static void main(String[] args){
        /*Result result = JUnitCore.runClasses(TestJunit.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());*/

        Result result = JUnitCore.runClasses(TestJunit.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

    }
}
