package com.overview.timetest_8;

/**
 * Created by renwujie on 2017/12/15 at 15:18
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
        while(true);
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
