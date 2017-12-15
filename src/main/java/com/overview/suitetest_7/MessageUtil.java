package com.overview.suitetest_7;

/**
 * Created by renwujie on 2017/12/15 at 15:01
 *
 * 测试套件意味着捆绑几个单元测试用例并且一起执行他们。
 * 在 JUnit 中，@RunWith 和 @Suite 注释用来运行套件测试。
 */
public class MessageUtil {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
