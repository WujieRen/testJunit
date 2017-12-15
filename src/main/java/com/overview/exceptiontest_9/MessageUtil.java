package com.overview.exceptiontest_9;

/**
 * Created by renwujie on 2017/12/15 at 15:22
 * unit 用代码处理提供了一个追踪异常的选项。你可以测试代码是否它抛出了想要得到的异常。
 * expected 参数和 @Test 注释一起使用。现在让我们看看活动中的 @Test(expected)。
 */
public class MessageUtil {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        int a =0;
        int b = 1/a;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
