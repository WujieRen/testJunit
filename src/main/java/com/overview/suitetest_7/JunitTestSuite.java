package com.overview.suitetest_7;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by renwujie on 2017/12/15 at 15:03
 *
 * 测试套件意味着捆绑几个单元测试用例并且一起执行他们。
 * 在 JUnit 中，@RunWith 和 @Suite 注释用来运行套件测试。
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})

public class JunitTestSuite {
}
